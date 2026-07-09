// Last updated: 7/9/2026, 9:50:14 AM
class Solution {
    public double myPow(double x, int n) {
        long N =n;
        while(N<0){
            x = 1/x;
            N =-N;
        }
        double res =1;
        while(N>0){
            if(N%2==1){
                res *=x;
            }
            x *=x;
            N/=2;
        }
        return res;
    }
}