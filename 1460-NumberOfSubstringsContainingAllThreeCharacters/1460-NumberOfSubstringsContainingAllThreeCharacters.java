// Last updated: 7/9/2026, 9:47:06 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int a=0,b=0,c=0;
        int left=0;
        int total = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(ch=='a')a++;
            else if(ch=='b')b++;
            else c++;

            while(a>0 && b>0 && c>0){
                total+=s.length()-right;
                char ca = s.charAt(left);
                if(ca=='a')a--;
                else if(ca=='b')b--;
                else c--;
                left++;
            }
        }
        return total;
    }
}