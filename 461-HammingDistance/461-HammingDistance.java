// Last updated: 7/9/2026, 9:48:27 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor= x^y;
        return Integer.bitCount(xor);
    }
}