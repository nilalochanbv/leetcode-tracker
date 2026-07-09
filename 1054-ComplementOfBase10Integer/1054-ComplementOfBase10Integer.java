// Last updated: 7/9/2026, 9:47:19 AM
class Solution {
    public int bitwiseComplement(int n) {
        int mask = (1<<Integer.toBinaryString(n).length())-1;
        return n^mask;
    }
}