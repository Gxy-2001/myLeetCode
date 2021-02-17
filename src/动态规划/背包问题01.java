package 动态规划;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-16
 */
public class 背包问题01 {
    /*
    给你一个可装载重量为W的背包和N个物品，每个物品有重量和价值两个属性。
    其中第i个物品的重量为wt[i]，价值为val[i]，现在让你用这个背包装物品，最多能装的价值是多少？

    大致框架
    for i in [1..N]:
    for w in [1..W]:
        dp[i][w] = max(
            dp[i-1][w],
            dp[i-1][w - wt[i-1]] + val[i-1]
        )
     return dp[N][W]
     */

    public int knapsack(int W, int N, int[] wt, int[] val) {
        // 全填入 0，base case 已初始化
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (w - wt[i - 1] < 0) {
                    // 当前背包容量装不下，只能选择不装入背包
                    dp[i][w] = dp[i - 1][w];
                } else {
                    // 装入或者不装入背包，择优
                    dp[i][w] = Math.max(
                            dp[i - 1][w - wt[i - 1]] + val[i - 1],
                            dp[i - 1][w]
                    );
                }
            }
        }
        return dp[N][W];
    }

}
