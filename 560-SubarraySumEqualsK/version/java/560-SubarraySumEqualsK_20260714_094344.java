// Last updated: 7/14/2026, 9:43:44 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int max =0;
4        int count=0;
5        for(int i=0;i<nums.length;i++){
6            int sum=0;
7            for(int j=i;j<nums.length;j++){
8                sum+=nums[j];
9                if(sum==k){
10                    int currlen = j-i+1;
11                    max = Math.max(max,currlen);
12                    count++;
13                }
14            }
15        }
16        return count;
17    }
18}