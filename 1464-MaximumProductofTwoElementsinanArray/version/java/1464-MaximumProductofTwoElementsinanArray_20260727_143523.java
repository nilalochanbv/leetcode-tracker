// Last updated: 7/27/2026, 2:35:23 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                max = Math.max((nums[i]-1)*(nums[j]-1),max);
7            }
8        }
9        return max;
10    }
11}