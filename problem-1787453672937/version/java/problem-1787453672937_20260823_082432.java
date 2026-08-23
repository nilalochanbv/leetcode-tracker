// Last updated: 8/23/2026, 8:24:32 AM
1class Solution {
2    public boolean isPalindromic(String s) {
3        String a="";
4        for(int i=0;i<s.length();i++){
5            int ch = s.charAt(i);
6            String b="";
7            for(int j=0;j<8;j++){
8                b=(ch%2)+b;
9                ch/=2;
10            }
11            a+=b;
12        }
13        int l=0;
14        int r=a.length()-1;
15        while(l<r){
16            if(a.charAt(l)!=a.charAt(r)) return false;
17            l++;
18            r--;
19        }
20        return true;
21    }
22}