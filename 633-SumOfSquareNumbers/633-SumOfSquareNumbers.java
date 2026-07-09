// Last updated: 7/9/2026, 9:48:11 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0,r=(int)Math.sqrt(c);
        while(l<=r){
            long sum = (long)l*l + (long)r*r;
            if(sum==c) return true;
            else if (sum<c) l++;
            else r--;
        }
        return false;
    }
}