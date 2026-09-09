// Last updated: 9/9/2026, 6:04:20 PM
1class Solution {
2    private static final long[] pow1000 = { 1000L, 1000000L, 1000000000L, 1000000000000L, 1000000000000000L, 1000000000000000000L };
3    
4    public long countCommas(long n) {
5        int k = 0;        
6        for (long p : pow1000) if (n >= p) k++;
7        
8        return k * (n + 1) - (pow1000[k] - 1000) / 999;
9    }
10}