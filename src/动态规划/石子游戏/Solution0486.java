package 动态规划.石子游戏;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-18
 */
public class Solution0486 {
    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = nums[i];
        }
        //dp[i][j] 表示当数组剩下的部分为下标 i 到下标 j 时，当前玩家与另一个玩家的分数之差的最大值，注意当前玩家不一定是先手
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                //当前玩家可以选择 nums[i] 或 nums[j]，然后轮到另一个玩家在数组剩下的部分选取数字。
                //在两种方案中，当前玩家会选择最优的方案，使得自己的分数最大化。
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][length - 1] >= 0;
    }
}
