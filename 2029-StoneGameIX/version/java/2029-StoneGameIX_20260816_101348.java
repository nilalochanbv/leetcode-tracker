// Last updated: 8/16/2026, 10:13:48 AM
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int []arr = new int[3];
4        for(int s : stones){
5            arr[s%3]++;
6        }
7        if(arr[0]%2==0){
8            return arr[1]>=1 && arr[2]>=1;
9        }
10        return Math.abs(arr[1]-arr[2])>2;
11    }
12}