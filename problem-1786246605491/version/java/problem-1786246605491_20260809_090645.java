// Last updated: 8/9/2026, 9:06:45 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5
6        double tot = 0;
7        for(int p : prices){
8            tot+=p;
9        }
10        int len1 = prices.length;
11        int len2 = discounts.length;
12        int max=Math.min(len1,len2);
13        for(int i=0;i<max;i++){
14            int curp = prices[len1-1-i];
15            int curd = discounts[len2-1-i];
16            double save =  curp *curd/100.0;
17            tot-=save;
18        }
19        return tot;
20    }
21}