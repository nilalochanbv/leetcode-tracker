// Last updated: 8/9/2026, 9:09:52 AM
1class Solution {
2    int n;
3    int[][][] t;
4
5    public int stoneGameII(int[] piles) {
6        n = piles.length;
7        t = new int[2][n][n + 1];
8        for (int[][] arr : t)
9            for (int[] row : arr)
10                Arrays.fill(row, -1);
11
12        return solve(piles, 1, 0, 1);
13    }
14
15    private int solve(int[] piles, int person, int i, int M) {
16        if (i >= n) return 0;
17        if (t[person][i][M] != -1) return t[person][i][M];
18
19        int result = (person == 1) ? 0 : Integer.MAX_VALUE;
20        int stones = 0;
21
22        for (int x = 1; x <= Math.min(2 * M, n - i); x++) {
23            stones += piles[i + x - 1];
24
25            if (person == 1) { // Alice wants to maximize
26                result = Math.max(result, stones + solve(piles, 0, i + x, Math.max(M, x)));
27            } else { // Bob wants to minimize Alice's score
28                result = Math.min(result, solve(piles, 1, i + x, Math.max(M, x)));
29            }
30        }
31
32        return t[person][i][M] = result;
33    }
34}