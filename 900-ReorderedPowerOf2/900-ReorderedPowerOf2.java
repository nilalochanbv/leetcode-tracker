// Last updated: 7/9/2026, 9:47:27 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] index = freq(n);

        for(int i=0; i<30; i++){
            int digit = (int) Math.pow(2,i);
            if(equal(index, freq(digit)))
                return true;
        }
        return false;  
    }

    public int[] freq(int n){
        int[] index = new int[10];
        while(n > 0){
            index[n%10]++;
            n /= 10;
        }
        return index;
    }

    public boolean equal(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}