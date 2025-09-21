package Algorithm.arr;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for (int currentPrice : prices) {
            if (minPrice > currentPrice) {
                minPrice = currentPrice;
            }
            profit = Math.max(profit, currentPrice - minPrice);
        }
        return profit;
    }
}
