// Last updated: 7/9/2026, 9:45:29 AM
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int s=n-k;
        int e=n+k;

        if(s<1){
            s=1;
        }
        for(int i=s;i<=e;i++){
            if((n&i)==0){
                sum+=i;
            }
        }
        return sum;
    }
}