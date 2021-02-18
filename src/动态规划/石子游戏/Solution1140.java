package 动态规划.石子游戏;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-18
 */
public class Solution1140 {
    /**
     * dp[i][j]表示剩余[i : len - 1]堆时，M = j的情况下，先取的人能获得的最多石子数
     *
     * i + 2M >= len, dp[i][M] = sum[i : len - 1], 剩下的堆数能够直接全部取走，那么最优的情况就是剩下的石子总和
     *
     * i + 2M < len, dp[i][M] = max(dp[i][M], sum[i : len - 1] - dp[i + x][max(M, x)]),
     * 其中 1 <= x <= 2M，剩下的堆数不能全部取走，那么最优情况就是让下一个人取的更少。
     * 对于我所有的x取值，下一个人从x开始取起，M变为max(M, x)，所以下一个人能取dp[i + x][max(M, x)]，
     * 我最多能取sum[i : len - 1] - dp[i + x][max(M, x)]。
     * @param piles
     * @return
     */
    public int stoneGameII(int[] piles) {
        int len = piles.length, sum = 0;
        int[][] dp = new int[len][len + 1];
        for (int i = len - 1; i >= 0; i--) {
            sum += piles[i];
            for (int M = 1; M <= len; M++) {
                if (i + 2 * M >= len) {
                    dp[i][M] = sum;
                } else {
                    //如果剩下的不能全部取走，就让另一个人取的更少
                    for (int x = 1; x <= 2 * M; x++) {
                        dp[i][M] = Math.max(dp[i][M], sum - dp[i + x][Math.max(M, x)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
