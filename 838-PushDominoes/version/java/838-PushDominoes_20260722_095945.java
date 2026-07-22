// Last updated: 7/22/2026, 9:59:45 AM
1class Solution {
2    public String pushDominoes(String str) {
3        int len = str.length();
4        int right[]=new int[len];
5        int left[]=new int[len];
6        int force=0;
7
8        for(int i=0;i<len;i++){
9            if(str.charAt(i)=='R'){
10                force=len;
11            }
12            else if(str.charAt(i)=='L'){
13                force=0;
14            }
15            else{
16                if(force>0) force--;
17            }
18            right[i]=force;
19        }
20        for(int i=len-1;i>=0;i--){
21            if(str.charAt(i)=='L'){
22                force=len;
23            }
24            else if(str.charAt(i)=='R'){
25                force=0;
26            }
27            else{
28                if(force>0) force--;
29            }
30            left[i]=force;
31        }
32        StringBuilder sb = new StringBuilder();
33        for(int i=0;i<len;i++){
34            if(right[i]>left[i]){
35                sb.append('R');
36            }
37            else if(left[i]>right[i]){
38                sb.append('L');
39            }
40            else{
41                sb.append('.');
42            }
43        }
44        return sb.toString();
45    }
46}