// Last updated: 7/15/2026, 9:36:48 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curr=nums[0];
4        int max = nums[0];
5        for(int i=1;i<nums.length;i++){
6            curr=Math.max(nums[i],nums[i]+curr);
7            max=Math.max(max,curr);
8        }
9        return max;
10    }
11}