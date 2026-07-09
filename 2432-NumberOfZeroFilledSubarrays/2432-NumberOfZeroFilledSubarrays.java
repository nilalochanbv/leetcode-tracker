// Last updated: 7/9/2026, 9:46:33 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0;
        long curr = 0;
        for(int num : nums){
            if(num==0){
                curr++;
                total+=curr;
            }
            else{
                curr=0;
            }
        }
        return total;
    }
}