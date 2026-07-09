// Last updated: 7/9/2026, 9:46:38 AM
class Solution {
    public String largestGoodInteger(String num) {
        String ans ="";
        for(int i=0;i+2<num.length();i++){
            char ch = num.charAt(i);
            if(ch == num.charAt(i+1) && ch == num.charAt(i+2)){
                if(ans.isEmpty() || ch > ans.charAt(0)){
                    ans = ""+ch+ch+ch;
                }
            }
        }
        return ans;
    }
}