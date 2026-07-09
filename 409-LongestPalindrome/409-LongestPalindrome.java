// Last updated: 7/9/2026, 9:48:30 AM
class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[128];

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        int ans=0;
        for(int count : freq){
            ans+=(count/2)*2;
        }
        if(ans<s.length()){
            ans++;
        }
    return ans;
    }
}