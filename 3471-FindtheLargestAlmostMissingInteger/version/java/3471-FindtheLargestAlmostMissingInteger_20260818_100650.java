// Last updated: 8/18/2026, 10:06:50 AM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4        Map<Integer, Integer> count = new HashMap<>();
5        for (int i = 0; i <= n - k; i++) {
6            boolean[] seen = new boolean[51]; 
7            for (int j = i; j < i + k; j++) {
8                if (!seen[nums[j]]) {
9                    seen[nums[j]] = true;
10                    count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
11                }
12            }
13        }
14        int ans = -1;
15        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
16            if (entry.getValue() == 1) {
17                ans = Math.max(ans, entry.getKey());
18            }
19        }
20        return ans;
21    }
22}