// Last updated: 7/9/2026, 9:48:06 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currMax = 1; int maxSoFar = 1;
        for (int i = 1; i < nums.length; i++) {
            currMax = (nums[i] > nums[i - 1]) ? currMax + 1 : 1;
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}