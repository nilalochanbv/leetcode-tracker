// Last updated: 7/9/2026, 9:46:28 AM
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int clockwise = (i - startIndex + n) % n;
                int anticlockwise = (startIndex - i + n) % n;
                ans = Math.min(ans, Math.min(clockwise, anticlockwise));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}