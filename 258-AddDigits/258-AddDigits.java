// Last updated: 7/9/2026, 9:48:53 AM
class Solution {
    public int addDigits(int num) {
        int sum =0;
        while(num>=10){
            sum=0;
            while(num>0){
                int temp = num %10;
                sum+=temp;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}