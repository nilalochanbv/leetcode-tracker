// Last updated: 8/6/2026, 11:24:23 AM
1class Solution {
2
3    public int smallestNumber(int n, int t) {
4        while (!check(n, t)) {
5            n++;
6        }
7        return n;
8    }
9
10    private boolean check(int num, int t) {
11        int product = 1;
12        while (num > 0) {
13            product *= num % 10;
14            num /= 10;
15            if (product == 0) {
16                break;
17            }
18        }
19        return product % t == 0;
20    }
21}