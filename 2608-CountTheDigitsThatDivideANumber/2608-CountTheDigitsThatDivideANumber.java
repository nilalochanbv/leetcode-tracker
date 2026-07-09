// Last updated: 7/9/2026, 9:46:26 AM
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(temp > 0){
            int d = temp % 10;
            if(num % d == 0){
                count++;
            }
            temp/= 10;
        }
        return count;
    }
}