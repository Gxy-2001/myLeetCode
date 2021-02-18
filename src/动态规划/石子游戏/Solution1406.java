package 动态规划.石子游戏;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-18
 */
public class Solution1406 {
    public String stoneGameIII(int[] A) {
        int n = A.length, dp[] = new int[n + 1];
        for (int i = n - 1; i >= 0; --i) {
            dp[i] = Integer.MIN_VALUE;
            for (int k = 0, take = 0; k < 3 && i + k < n; ++k) {
                take += A[i + k];
                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
            }
        }
        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}
