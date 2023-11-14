package dp_multidimensional;

public class StockTradingProfitCalculator {

    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1) return 0;
        int days = prices.length;
        int[] buy = new int[days];
        int[] sell = new int[days];
        buy[0] = -prices[0];
        for (int i = 1; i < days; i++) {
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
        }
        return sell[days - 1];
    }

    public static void main(String[] args) {
        StockTradingProfitCalculator calculator = new StockTradingProfitCalculator();

        assert calculator.maxProfit(new int[]{1,3,2,8,4,9}, 2) == 8 : "Test case 1 failed";
        assert calculator.maxProfit(new int[]{1,3,7,5,10,3}, 3) == 6 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
