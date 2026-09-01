// Last updated: 9/1/2026, 12:09:06 PM
1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int m = classroom.length;
4        int n = classroom[0].length();
5
6        int sr = -1, sc = -1;
7        int cnt = 0;
8        int[][] id = new int[m][n];
9        for(int[] row : id) Arrays.fill(row, -1);
10
11        for(int i = 0; i < m; i++){
12            for(int j = 0; j < n; j++){
13                if(classroom[i].charAt(j) == 'S'){
14                    sr = i;
15                    sc = j;
16                }
17                if(classroom[i].charAt(j) == 'L'){
18                    id[i][j] = cnt++;
19                }
20            }
21        }
22        int masks = 1 << cnt;
23        int fullMask = masks - 1;
24        int[][][] best = new int[m][n][masks];
25        for(int[][] layer : best)
26            for(int[] row : layer)
27                Arrays.fill(row, -1);
28
29        class State {
30            int r, c, mask, en, dist;
31
32            State(int r, int c, int mask, int en, int dist){
33                this.r = r;
34                this.c = c;
35                this.mask = mask;
36                this.en = en;
37                this.dist = dist;
38            }
39        }
40
41        Queue<State> q = new LinkedList<>();
42        q.add(new State(sr, sc, 0, energy, 0));
43        best[sr][sc][0] = energy;
44
45        int[] dr = {-1, 1, 0, 0};
46        int[] dc = {0, 0, -1, 1};
47
48        while(!q.isEmpty()){
49            State cur = q.poll();
50            int r = cur.r;
51            int c = cur.c;
52            int mask = cur.mask;
53            int en = cur.en;
54            int dist = cur.dist;
55            if(mask == fullMask){
56                return dist;
57            }
58            if(en == 0){
59                continue;
60            }
61            for(int d = 0; d < 4; d++){
62                int nr = r + dr[d];
63                int nc = c + dc[d];
64                if(nr < 0 || nr >= m || nc < 0 || nc >= n){
65                    continue;
66                }
67                if(classroom[nr].charAt(nc) == 'X'){
68                    continue;
69                }
70                int newEn = en - 1;
71                int newMask = mask;
72                if(classroom[nr].charAt(nc) == 'L'){
73                    newMask |= (1 << id[nr][nc]);
74                }
75                if(classroom[nr].charAt(nc) == 'R'){
76                    newEn = energy;
77                }
78                if(best[nr][nc][newMask] >= newEn){
79                    continue;
80                }
81                best[nr][nc][newMask] = newEn;
82                q.add(new State(nr, nc, newMask, newEn, dist + 1));
83            }
84        }
85        return -1;
86    }
87}