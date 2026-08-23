// Last updated: 8/23/2026, 8:30:32 AM
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>>res = new ArrayList<>();
4        boolean[]seen = new boolean[upper+1];
5        for(int num : nums){
6            if(num>=lower && num<=upper){
7                seen[num]=true;
8            }
9        }
10        int ele = lower;
11        while(ele<=upper){
12            if(seen[ele]){
13                ele++;
14                continue;
15            }
16            int st=ele;
17            while(ele<=upper && !seen[ele]){
18                ele++;
19            }
20            int ed=ele-1;
21            res.add(Arrays.asList(st,ed));
22        }
23        return res;
24    }
25}