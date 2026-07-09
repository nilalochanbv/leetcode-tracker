// Last updated: 7/9/2026, 9:47:28 AM
class Solution {
    public double new21Game(int n, int k, int maxpts) {
        if(k==0 || n >=k-1 + maxpts)
        return 1.0;
        double[] dp = new double[maxpts];
        dp[0]=1.0;
        double sum =1.0,res =0.0;
        for(int i=1;i<=n;i++){
            double p = sum/maxpts;
            if(i<k){
                sum +=p;
            }
            else{
                res +=p;
            }
            if(i>=maxpts){
                sum -=dp[i % maxpts];
            }
            dp[i % maxpts] =p;
        }
        return res;
    }
}