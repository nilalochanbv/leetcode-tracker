// Last updated: 7/9/2026, 9:46:10 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        int lower = 0;
        int upper = 0;

        for(char ch : word.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                lower |= (1 << (ch - 'a'));
            }
            else {
                upper |= (1 << (ch - 'A'));
            }
        }
        int common = lower & upper;
        return Integer.bitCount(common);
    }
}