// Last updated: 7/9/2026, 9:47:35 AM
class Solution {
    public boolean rotateString(String s, String goal) {
          if(s.length()!=goal.length()){
            return false;
        }
        String str= s+s;
        return str.contains(goal);
        
    }
}