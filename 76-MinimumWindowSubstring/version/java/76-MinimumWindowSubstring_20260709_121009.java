// Last updated: 7/9/2026, 12:10:09 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length()) return "";
5
6        int[] freq = new int[128];
7
8        // Store frequency of characters in t
9        for (char c : t.toCharArray()) {
10            freq[c]++;
11        }
12
13        int left = 0;
14        int right = 0;
15        int count = t.length();
16
17        int minLen = Integer.MAX_VALUE;
18        int start = 0;
19
20        while (right < s.length()) {
21
22            char ch = s.charAt(right);
23
24            if (freq[ch] > 0) {
25                count--;
26            }
27
28            freq[ch]--;
29            right++;
30
31            while (count == 0) {
32
33                if (right - left < minLen) {
34                    minLen = right - left;
35                    start = left;
36                }
37
38                char leftChar = s.charAt(left);
39
40                freq[leftChar]++;
41
42                if (freq[leftChar] > 0) {
43                    count++;
44                }
45
46                left++;
47            }
48        }
49
50        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
51    }
52}