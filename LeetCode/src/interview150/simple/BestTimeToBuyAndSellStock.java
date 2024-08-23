package interview150.simple;

/**
 * 121. 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        // dp[i][0] 持有股最大值 dp[i][1] 不持有股最大值
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
        }

        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
