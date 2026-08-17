// Last updated: 8/17/2026, 10:14:24 PM
1class Solution {
2    int[][] memo;
3    int[] prefixSum;
4
5    public int stoneGameV(int[] stoneValue) {
6        int n = stoneValue.length;
7        memo = new int[n][n];
8        prefixSum = new int[n + 1];
9        for (int i = 0; i < n; i++) {
10            prefixSum[i + 1] = prefixSum[i] + stoneValue[i];
11        }
12
13        return solve(stoneValue, 0, n - 1);
14    }
15
16    private int solve(int[] stoneValue, int i, int j) {
17        if (i == j) return 0;
18        if (memo[i][j] != 0) return memo[i][j];
19
20        int maxScore = 0;
21        for (int k = i; k < j; k++) {
22            int leftSum = prefixSum[k + 1] - prefixSum[i];
23            int rightSum = prefixSum[j + 1] - prefixSum[k + 1];
24
25            if (leftSum < rightSum) {
26                maxScore = Math.max(maxScore, leftSum + solve(stoneValue, i, k));
27            } else if (rightSum < leftSum) {
28                maxScore = Math.max(maxScore, rightSum + solve(stoneValue, k + 1, j));
29            } else {
30                int leftChoice = solve(stoneValue, i, k);
31                int rightChoice = solve(stoneValue, k + 1, j);
32                maxScore = Math.max(maxScore, leftSum + Math.max(leftChoice, rightChoice));
33            }
34        }
35
36        return memo[i][j] = maxScore;
37    }
38}