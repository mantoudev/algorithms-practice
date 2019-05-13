class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int buy = -prices[0], sell = 0;
        for(int i = 1; i < prices.length; i++) {
           buy = Math.max(buy, sell - prices[i]);
           sell = Math.max(sell, buy + prices[i]);

        }
        return sell;
    }
}
