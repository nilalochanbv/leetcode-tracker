// Last updated: 8/3/2026, 9:25:10 PM
1// class Solution {
2//     public int lengthOfLongestSubstring(String s) {
3//        int left =0;
4//        int max =0;
5//        Map<Character,Integer> map =  new HashMap<>();
6//        for(int right =0;right<s.length();right++){
7//         char c = s.charAt(right);
8//         if(map.containsKey(c)){
9//             left =Math.max(left,map.get(c)+1);
10//         }
11//         map.put(c,right);
12//         max = Math.max(max,right-left+1);
13
14//        } 
15//        return max;
16//     }
17// }
18class Solution{
19     public int lengthOfLongestSubstring(String s) {
20        int left =0;
21        int max =0;
22        Set<Character>set=new HashSet<>();
23        for(int i=0;i<s.length();i++){
24        char ch = s.charAt(i);
25        while(set.contains(ch)){
26            set.remove(s.charAt(left));
27            left++;
28        }
29        set.add(ch);
30        max = Math.max(max,i-left+1);
31        }
32        return max;
33     }
34}