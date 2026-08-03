// Last updated: 8/3/2026, 9:37:43 AM
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int []arr = new int[n+1];
5        for(int i=n-1;i>=0;i--){
6            int s = Integer.MIN_VALUE;
7            int run = 0;
8            for(int j=1;j<=3;j++){
9                if(i+j>n) break;
10                run+=stoneValue[i+j-1];
11                s = Math.max(s,run-arr[i+j]);
12            }
13            arr[i]=s;
14        }
15        if(arr[0]>0) return "Alice";
16        else if(arr[0]<0) return "Bob";
17        else return "Tie";
18    }
19}