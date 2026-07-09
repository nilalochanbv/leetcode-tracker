// Last updated: 7/9/2026, 9:45:42 AM
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int bias = n + 1;
        long[] countB = new long[2 * n + 2];
        int balance = bias;
        countB[balance] = 1;
        long ans = 0;
        long sum = 0; 
        for (int x : nums) {
            if (x == target) {
                sum += countB[balance];
                balance++;
            } else {
                balance--;
                sum -= countB[balance];
            }
            countB[balance]++;
            ans += sum;
        }
        return ans;
    }
}