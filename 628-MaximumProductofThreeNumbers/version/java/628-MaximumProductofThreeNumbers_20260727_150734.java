// Last updated: 7/27/2026, 3:07:34 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int l=nums.length;
4        // int max = Integer.MIN_VALUE;
5        // for(int i=0;i<nums.length;i++){
6        //     for(int j=i+1;j<nums.length;j++){
7        //         for(int k=j+1;k<nums.length;k++){
8        //             max = Math.max(max,nums[i]*nums[j]*nums[k]);
9        //         }
10        //     }
11        // }
12        Arrays.sort(nums);
13        int a=nums[l-1]*nums[l-2]*nums[l-3];
14        int b= nums[0]*nums[1]*nums[l-1];
15        int max=Math.max(a,b);
16        return max;
17    }
18}