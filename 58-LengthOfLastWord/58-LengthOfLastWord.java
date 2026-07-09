// Last updated: 7/9/2026, 9:50:08 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                length++;
            } else {  
                if (length > 0) return length;
            }
        }
        return length;
    }
}