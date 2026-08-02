// Last updated: 8/2/2026, 8:25:13 AM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int count = 0;
4        int n = nums.length;
5
6        for(int i=0;i<n;i++){
7            long even=0;
8            long odd=0;
9            for(int j=i;j<n;j++){
10                if(nums[j]%2==0){
11                    even++;
12                }
13                else{
14                    odd++;
15                }
16                if(odd>0){
17                    long tot = even*b -odd*a;
18                    if(tot <=0){
19                        count++;
20                    }
21                }
22            }
23        }
24        return count;
25    }
26}