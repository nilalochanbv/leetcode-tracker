// Last updated: 7/9/2026, 9:49:38 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price<minPrice){
            minPrice =price;
        }
        else if(price-minPrice > maxProfit){
            maxProfit = price - minPrice;
        }
    }
        return maxProfit;
    }
}