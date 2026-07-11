// Last updated: 7/11/2026, 2:04:19 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String str = s.replace("-","");
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6        for(int i=str.length()-1;i>=0;i--){
7            char ch = str.charAt(i);
8            if(count==k){
9                sb.append('-');
10                count=0;
11            }
12            sb.append(Character.toUpperCase(ch));
13            count++;
14        }
15        return sb.reverse().toString();
16    }
17}