// Last updated: 7/9/2026, 9:46:59 AM
class Solution {
    public boolean checkIfPangram(String s) {
        String str = s.toLowerCase();
        if(s.length()<26){
            return false;
        }
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)<0){
                return false;
            }
        }
            return true;
    }
}