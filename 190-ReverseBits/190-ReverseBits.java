// Last updated: 7/9/2026, 9:49:14 AM
class Solution {
    public int reverseBits(int n) { return rev(n, 32); }

    private int rev(int v, int len) {
        if (len == 1) return v & 1;

        int half = len >> 1;
        int mask = (1 << half) - 1;
        int lo = v & mask;
        int hi = v >>> half;

        return (rev(lo, half) << half) | rev(hi, half);
    }
}
