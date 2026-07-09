// Last updated: 7/9/2026, 9:48:33 AM
class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for (int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
            int index =-1;
            for(int i=0;i<s.length();i++){
                if(freq[s.charAt(i)-'a']==1){
                    index =i;
                    break;
                }
            }
        return index;
        
    }
}