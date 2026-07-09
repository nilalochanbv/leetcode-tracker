// Last updated: 7/9/2026, 9:46:25 AM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;  // move the smaller pointer forward
            } else {
                j++;  // move the smaller pointer forward
            }
        }
        return -1;
    }
}