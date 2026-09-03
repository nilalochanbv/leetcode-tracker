// Last updated: 9/3/2026, 6:54:19 AM
1class Solution {
2    public boolean uniformArray(int[] nums) {
3        int small = Integer.MAX_VALUE;
4        for (int num : nums) {
5            if (num % 2 == 1)
6                small = Math.min(small, num);
7        }
8        if (small == Integer.MAX_VALUE)
9            return true;
10        for (int num : nums) {
11            if (num % 2 == 0 && num <= small)
12                return false;
13        }
14
15        return true;
16    }
17}