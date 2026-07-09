// Last updated: 7/9/2026, 9:49:16 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int t=0;
        k=k%nums.length;
        rev(0,nums.length-1,nums);
        rev(0,k-1,nums);
        rev(k,nums.length-1,nums);
    }
    public static void rev(int i,int j,int[] nums){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}