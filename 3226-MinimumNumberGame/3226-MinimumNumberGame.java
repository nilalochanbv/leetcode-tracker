// Last updated: 7/9/2026, 9:46:17 AM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            int temp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}