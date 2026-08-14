// Last updated: 8/14/2026, 9:03:25 AM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int count[] = new int[26];
4        int max = 0;
5        int left =0;
6        for(int right=0;right<s.length();right++){
7            char ch = s.charAt(right);
8            count[ch-'a']++;
9            while(count[ch-'a']>2){
10                count[s.charAt(left)-'a']--;
11                left++;
12            }
13            max=Math.max(max,right-left+1);
14        }
15        return max;
16    }
17}