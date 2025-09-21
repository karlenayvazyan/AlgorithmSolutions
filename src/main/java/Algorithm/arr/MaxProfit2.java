package Algorithm.arr;

public class MaxProfit2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int prevPrice = prices[i - 1];
            int currPrice = prices[i];
            if (prevPrice < currPrice) {
                profit += currPrice - prevPrice;
            }
        }
        return profit;
    }
}
