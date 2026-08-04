// Last updated: 8/4/2026, 11:04:26 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> res = new ArrayList<>();
4
5        Arrays.sort(nums);
6
7        int curr = nums[0];
8
9        for(int i = 0 ; i < nums.length ; curr++, i++){
10            if(curr < nums[i]){
11                res.add(curr);
12                i--;
13            }
14        }
15
16        return res;
17    }
18}