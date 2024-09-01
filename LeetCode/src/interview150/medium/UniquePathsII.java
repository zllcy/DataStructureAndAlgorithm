package interview150.medium;

/**
 * 63. 不同路径 II
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 1 || n == 1) {
            if (isHaveStock(obstacleGrid, m, n)) {
                return 0;
            }
            return 1;
        }

        int[][] dp = new int[m][n];
        for (int j = 0; j < n; j++) {
            if (isHaveStock(obstacleGrid, 1, j)) {
                dp[0][j] = 0;
            } else {
                dp[0][j] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (isHaveStock(obstacleGrid, i, 1)) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 0) {
                        //到达点上面是障碍物，只能从左边到达
                        dp[i][j] = dp[i][j - 1];
                    } else if (obstacleGrid[i - 1][j] == 0 && obstacleGrid[i][j - 1] == 1) {
                        //到达点左边是障碍物，只能从上面到达
                        dp[i][j] = dp[i - 1][j];
                    } else if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1) {
                        //左边右边都是障碍物，不能到达
                        dp[i][j] = 0;
                    } else {
                        //跟之前一样都可以到达
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                } else {
                    //到达点就是障碍物，不能到达
                    dp[i][j] = 0;
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 判断是否为障碍物
     *
     * @param arr
     * @param m
     * @param n
     * @return
     */
    private boolean isHaveStock(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
