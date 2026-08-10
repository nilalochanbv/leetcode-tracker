// Last updated: 8/10/2026, 6:15:52 PM
1class Solution {
2    boolean seen[] = new boolean[100001];
3    public boolean winnerSquareGame(int n) {
4        if(n==0) return false;
5        if(seen[n]) return seen[n];
6        for(int i=1;i*i<=n;i++){
7            if(!winnerSquareGame(n-i*i)){
8                return seen[n] = true;
9            }
10        }
11        return seen[n] = false;
12    }
13}