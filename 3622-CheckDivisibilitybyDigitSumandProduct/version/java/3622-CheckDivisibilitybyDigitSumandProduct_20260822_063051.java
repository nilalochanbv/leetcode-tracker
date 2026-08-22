// Last updated: 8/22/2026, 6:30:51 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        String s = String.valueOf(n);
4        int sum = 0;
5        int product = 1;
6        for (int i = 0; i < s.length(); i++) {
7            int digit = s.charAt(i) - '0';
8            sum += digit;
9            product *= digit;
10        }
11        return n % (sum + product) == 0;
12    }
13}