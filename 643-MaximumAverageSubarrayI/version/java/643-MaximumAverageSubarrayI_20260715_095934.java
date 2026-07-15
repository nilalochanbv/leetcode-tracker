// Last updated: 7/15/2026, 9:59:34 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum =0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int max=sum;
8        int left=0;
9        for(int right=k;right<nums.length;right++){
10            sum-=nums[left];
11            left++;
12            sum+=nums[right];
13
14            max = Math.max(max,sum);
15        }
16        return (double) max/k;    
17    }
18}