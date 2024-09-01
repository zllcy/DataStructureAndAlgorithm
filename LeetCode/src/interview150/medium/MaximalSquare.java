package interview150.medium;

/**
 * 221. 最大正方形
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        int m = matrix.length, n = matrix[0].length;
        if (matrix == null || m == 0 || n == 0) {
            return maxSide;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 如果该位置的值是 0，则dp(i,j)=0，因为当前位置不可能在由 1 组成的正方形中
                // 如果该位置的值是 1，则 dp(i,j) 的值由其上方、左方和左上方的三个相邻位置的 dp 值决定
                if (matrix[i][j] == '1') {
                    // 考虑边界条件。如果 i 和 j 中至少有一个为 0，则以位置 (i,j) 为右下角的最大正方形的边长只能是 1
                    if (i == 0 || j == 0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide * maxSide;
    }
}
