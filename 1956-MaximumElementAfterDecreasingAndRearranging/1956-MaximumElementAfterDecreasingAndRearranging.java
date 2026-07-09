// Last updated: 7/9/2026, 9:47:01 AM
class Solution {
    private static final int[] freq = new int[100005];
    public int maximumElementAfterDecrementingAndRearranging(int[] A) {
        int n = A.length;
        for (int x : A)
            freq[Math.min(x, n)]++;

        int res = 1;
        for (int i = 2; i <= n; i++)
            res = Math.min(res + freq[i], i);

        for (int i = 0; i <= n; i++)
            freq[i] = 0;

        return res;
    }
}