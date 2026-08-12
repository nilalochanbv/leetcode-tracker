// Last updated: 8/12/2026, 8:39:55 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int n = nums.length;
4        int r = 1;
5        int left = 0;
6        HashMap<Integer, Integer> freq = new HashMap<>();
7        for (int right = 0; right < n; right++) {
8            int c = nums[right];
9            freq.put(c, freq.getOrDefault(c, 0) + 1);
10            while (freq.get(c) > k) {
11                int d = nums[left];
12                freq.put(d, freq.get(d) - 1);
13                left++;
14            }
15            r = Math.max(r, right - left + 1);
16        }
17        return r;
18    }
19}