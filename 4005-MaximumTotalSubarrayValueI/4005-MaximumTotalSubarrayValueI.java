// Last updated: 7/9/2026, 9:45:46 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        
        // Find the global maximum and minimum elements
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
            if (num < minVal) minVal = num;
        }
        
        // Cast to long before multiplying to prevent integer overflow
        long maxDiff = (long) maxVal - minVal;
        
        return maxDiff * k;
    }
}