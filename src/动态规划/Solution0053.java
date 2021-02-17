package 动态规划;

/**
 * @program: 每日一题
 * @description: 最大子序列和
 * @author: Gxy-2001
 * @create: 2021-02-16
 */
public class Solution0053 {
    public int maxSubArray(int[] nums) {
        int res = nums[0], t = 0;
        for (int i : nums) {
            t += i;
            res = Math.max(t, res);
            if (t < 0) {
                t = 0;
            }
        }
        return res;
    }
}
