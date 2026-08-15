// Last updated: 8/15/2026, 9:00:48 PM
1class Solution {
2    public int minOperations(String s) {
3        int len = s.length();
4        int res = Integer.MAX_VALUE;
5
6        for(int i=0;i<len;i++){
7            String str = s.substring(i)+s.substring(0,i);
8
9            int op=i;
10            int left=0;
11            int right=len-1;
12            while(left<right){
13                int res1=str.charAt(left)-'a';
14                int res2=str.charAt(right)-'a';
15
16                int ans=Math.abs(res1-res2);
17                op+=Math.min(ans,26-ans);
18                left++;
19                right--;
20            }
21            res=Math.min(res,op);
22        }
23        return res;
24    }
25}