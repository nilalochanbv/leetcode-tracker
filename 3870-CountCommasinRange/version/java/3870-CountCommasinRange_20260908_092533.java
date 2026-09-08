// Last updated: 9/8/2026, 9:25:33 AM
1class Solution {
2    public int countCommas(int n) {
3        int c=0;
4        for(int i=1;i<=n;i++){
5            if(i>=1000) c++;
6        }
7        return c;
8    }
9}