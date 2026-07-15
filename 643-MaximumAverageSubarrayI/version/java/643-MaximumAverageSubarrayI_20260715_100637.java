// Last updated: 7/15/2026, 10:06:37 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum =0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int max = sum;
8        int left=0;
9
10        for(int right=k;right<nums.length;right++){
11            sum-=nums[left];
12            left++;
13            sum+=nums[right];
14
15            max = Math.max(max,sum);
16        }   
17        return (double) max/k;
18    }
19}