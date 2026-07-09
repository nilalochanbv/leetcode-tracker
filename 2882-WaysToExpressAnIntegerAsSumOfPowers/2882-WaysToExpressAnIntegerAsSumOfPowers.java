// Last updated: 7/9/2026, 9:46:20 AM
class Solution {
    static final int MOD =1000000007;
    public int numberOfWays(int n, int x) {
        int[] ns = new int[n+1];
        ns[0]=1;
        int max =0;
        while(Math.pow(max,x)<=n){
            max++;
        }
        max--;
        for(int i=1;i<=max;i++){
            int pow = (int) Math.pow(i,x);
            for(int j=n;j>=pow;j--){
                ns[j] = (ns[j]+ ns[j-pow]) % MOD;
            }
        }
        return ns[n];
    }
}