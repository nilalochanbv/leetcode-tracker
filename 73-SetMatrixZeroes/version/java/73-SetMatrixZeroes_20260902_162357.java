// Last updated: 9/2/2026, 4:23:57 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        boolean seen = false;
6        for (int i = 0; i < n; i++) {
7            if (matrix[i][0] == 0) seen = true;
8            for (int j = 1; j < m; j++) {
9                if (matrix[i][j] == 0) {
10                    matrix[i][0] = 0;
11                    matrix[0][j] = 0;
12                }
13            }
14        }
15        for (int i = n - 1; i >= 0; i--) {
16            for (int j = m - 1; j >= 1; j--) {
17                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
18                    matrix[i][j] = 0;
19                }
20            }
21            if (seen) {
22                matrix[i][0] = 0;
23            }
24        }
25    }
26}