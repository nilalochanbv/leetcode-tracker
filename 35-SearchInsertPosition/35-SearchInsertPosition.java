// Last updated: 7/9/2026, 9:50:24 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}