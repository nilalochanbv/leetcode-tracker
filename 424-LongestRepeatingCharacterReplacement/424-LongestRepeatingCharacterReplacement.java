// Last updated: 7/9/2026, 9:48:26 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int count[]=new int[26];
        int left=0;
        int freq=0;
        int len=0;
        for(int right=0;right<s.length();right++){
            count[s.charAt(right)-'A']++;
            freq=Math.max(freq,count[s.charAt(right)-'A']);
            while((right-left+1)-freq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            len=Math.max(len,(right-left+1));
        }
        return len;
    }
}