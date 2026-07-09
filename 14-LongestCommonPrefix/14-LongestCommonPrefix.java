// Last updated: 7/9/2026, 9:50:34 AM
class Solution {
    public String longestCommonPrefix(String[] str) {
        String ans="";
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(i>=str[j].length() || str[j].charAt(i)!=ch){
                    return ans;
                }
            }
            ans+=ch;
        }
        return ans;
    }
}