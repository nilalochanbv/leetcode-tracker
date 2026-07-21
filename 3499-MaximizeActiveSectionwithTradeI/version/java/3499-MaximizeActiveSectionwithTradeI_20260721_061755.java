// Last updated: 7/21/2026, 6:17:55 AM
1class Solution {
2
3    public int maxActiveSectionsAfterTrade(String s) {
4        int n = s.length();
5        int cnt1 = 0;
6        for (char c : s.toCharArray()) {
7            if (c == '1') cnt1++;
8        }
9
10        List<Integer> zeroBlocks = new ArrayList<>();
11        int i = 0;
12        while (i < n) {
13            int start = i;
14            while (i < n && s.charAt(i) == s.charAt(start)) {
15                i++;
16            }
17            if (s.charAt(start) == '0') {
18                zeroBlocks.add(i - start);
19            }
20        }
21
22        int m = zeroBlocks.size();
23        if (m < 2) {
24            return cnt1;
25        }
26        int bestGain = 0; // Optimal Increment
27        for (int j = 0; j < m - 1; j++) {
28            bestGain = Math.max(
29                bestGain,
30                zeroBlocks.get(j) + zeroBlocks.get(j + 1)
31            );
32        }
33
34        return cnt1 + bestGain;
35    }
36}