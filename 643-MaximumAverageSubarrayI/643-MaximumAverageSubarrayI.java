// Last updated: 7/9/2026, 9:48:09 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currsum = 0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        double max = currsum;
        for(int i=k;i<nums.length;i++){
            currsum+=nums[i]-nums[i-k];
            max = Math.max(max,currsum);
        }
        return max/k;
    }
}