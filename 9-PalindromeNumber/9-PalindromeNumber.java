// Last updated: 7/9/2026, 9:50:39 AM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int og = x;
        int rev = 0;
        while (x != 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x /= 10;
        }
        return og == rev;
    }
}

