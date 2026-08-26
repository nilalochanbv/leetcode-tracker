// Last updated: 8/26/2026, 10:48:39 PM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        String ans = "";
4        int n = s.length();
5
6        for (int i = 0; i < n; i++) {
7
8            int oneCnt = 0;
9            StringBuilder cur = new StringBuilder();
10
11            for (int j = i; j < n; j++) {
12
13                cur.append(s.charAt(j));
14
15                if (s.charAt(j) == '1')
16                    oneCnt++;
17                if (oneCnt > k)
18                    break;
19
20                if (oneCnt == k) {
21                    String curStr = cur.toString();
22
23                    if (ans.isEmpty() ||
24                        curStr.length() < ans.length() ||
25                        (curStr.length() == ans.length() && curStr.compareTo(ans) < 0)) {
26
27                        ans = curStr;
28                    }
29                }
30            }
31        }
32
33        return ans;
34    }
35}