// Last updated: 7/9/2026, 9:50:02 AM
class Solution {
    public void sortColors(int[] nums) {
        // int low=0;
        // int mid=0;
        // int high=nums.length-1;
        // while(mid<=high){
        //     if(nums[mid]==0){
        //         int temp = nums[low];
        //         nums[low++]=nums[mid];
        //         nums[mid++]=temp;
        //     }
        //     else if(nums[mid]==1){
        //         mid++;
        //     }
        //     else{
        //         int temp = nums[mid];
        //         nums[mid]=nums[high];
        //         nums[high--]=temp;
        //     }
        // }
        Arrays.sort(nums);
    }
}