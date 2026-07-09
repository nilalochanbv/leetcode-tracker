// Last updated: 7/9/2026, 9:45:28 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            long curr=0;
            for(int j=i;j<nums.length;j++){
                curr+=nums[j];
                if(curr % 10 ==x){
                    long temp = curr;
                    while(temp>=10){
                        temp/=10;
                    }
                    if(temp==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}