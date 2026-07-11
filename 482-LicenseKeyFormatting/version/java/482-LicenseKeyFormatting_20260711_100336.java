// Last updated: 7/11/2026, 10:03:36 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        int count=0;
5        for(int i=s.length()-1;i>=0;i--){
6            char ch = s.charAt(i);
7            if(ch=='-') continue;
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