// Last updated: 7/9/2026, 9:50:47 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
        
        
    }
}