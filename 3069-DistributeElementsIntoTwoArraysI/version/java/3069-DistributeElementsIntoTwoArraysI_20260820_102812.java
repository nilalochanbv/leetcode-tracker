// Last updated: 8/20/2026, 10:28:12 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int[] nums1 = new int[nums.length];
4        int[] nums2 = new int[nums.length];
5        int n1 = 0;
6        int n2 = 0;
7        for (int i = 0; i < nums.length; i++) {
8            if (i == 0) {
9                nums1[n1++] = nums[i];
10            } else if (i == 1) {
11                nums2[n2++] = nums[i];
12            } else {
13                if (nums1[n1 - 1] > nums2[n2 - 1]) {
14                    nums1[n1++] = nums[i];
15                } else {
16                    nums2[n2++] = nums[i];
17                }
18            }
19        }
20        for (int i = 0; i < n2; i++) {
21            nums1[n1++] = nums2[i];
22        }
23        return nums1;
24    }
25}