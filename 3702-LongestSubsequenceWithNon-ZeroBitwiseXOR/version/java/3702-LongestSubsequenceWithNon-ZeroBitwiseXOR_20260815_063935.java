// Last updated: 8/15/2026, 6:39:35 AM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int totalXor = 0;
4        boolean hasNonZero = false;
5        for (int x : nums) {
6            totalXor ^= x;
7            if (x != 0) {
8                hasNonZero = true;
9            }
10        }
11        if (!hasNonZero) {
12            return 0;
13        }
14        if (totalXor != 0) {
15            return nums.length;
16        }
17        return nums.length - 1;
18    }
19}