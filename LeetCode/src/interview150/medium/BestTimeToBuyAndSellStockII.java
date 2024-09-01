package interview150.medium;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        // dp[i][0] 表示第 i 天交易完后手里没有股票的最大利润
        // dp[i][1] 表示第 i 天交易完后手里持有一支股票的最大利润
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
        }

        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
