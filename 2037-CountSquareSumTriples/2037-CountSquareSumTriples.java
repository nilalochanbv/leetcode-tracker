// Last updated: 7/9/2026, 9:46:55 AM
class Solution {
    public int countTriples(int n) {
        int count =0;
        for (int a=1;a<=n;a++){
            for(int b = 1;b<=n;b++){
                for(int c = 1;c<=n;c++){
                    if((a*a)+(b*b)==(c*c)){
                        count++;

                    }
                    
                }

            }
        }
       return count; 
    }
    
}