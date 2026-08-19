// Last updated: 8/19/2026, 9:29:10 PM
1class Solution {
2
3    public int maxNumberOfFamilies(int n, int[][] rs) {
4        HashMap<Integer, Integer> mp = new HashMap<>(); 
5        for(int[] r: rs) {
6            int row = r[0], seat = r[1]; 
7            mp.merge(row, 1 << (10 - seat), (a, b) -> a | b);
8        }
9        int ans = (n - mp.size()) * 2; 
10        int[] masks = {0b0111100000, 0b0000011110, 0b0001111000};
11
12        for(int x: mp.values()) {
13            for(int m: masks) {
14                if((m & x) == 0) {
15                    ans++; 
16                    x |= m; 
17                }
18            }
19        }
20        return ans; 
21    }
22    public int maxNumberOfFamiliesUsingList(int n, int[][] rs) {
23        HashMap<Integer, List<Integer>> mp = new HashMap<>(); 
24        for(int[] r: rs) {
25            if(r[1] == 1 || r[1] == 10) continue; 
26            mp.computeIfAbsent(r[0], k -> new ArrayList<>()).add(r[1]); 
27        }
28
29        int sz = mp.size();
30        int left = n - sz;
31        int ans = 2 * left;  
32
33        for(Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
34            List<Integer> value = entry.getValue();  
35        
36            boolean block1 = true, block2 = true, block3 = true; 
37            for(Integer x: value) {
38                if(x >= 2 && x <= 5) block1 = false; 
39                if(x >= 4 && x <= 7) block2 = false; 
40                if(x >= 6 && x <= 9) block3 = false; 
41            }
42
43            if(block1 && block3) ans += 2; 
44            else if(block1 || block2 || block3) ans += 1; 
45
46        }; 
47        return ans; 
48    }
49}