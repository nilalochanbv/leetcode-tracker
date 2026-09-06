// Last updated: 9/6/2026, 9:13:04 AM
1class Solution {
2    public int countRotations(String s, int k) {
3        int sol=0;
4        for(int i=0;i<s.length();i++){
5            String r=s.substring(i)+s.substring(0,i);
6            int sc=0;
7            for(int j=0;j<s.length()-1;j++){
8                if(r.charAt(j)==r.charAt(j+1)){
9                    sc++;
10                }
11            }
12            if(sc==k){
13                sol++;
14            }
15        }
16        return sol;
17    }
18}