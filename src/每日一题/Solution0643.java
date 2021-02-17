package 每日一题;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-04
 */
public class Solution0643 {
    public double findMaxAverage(int[] nums, int k) {
        int t = 0;
        for (int i = 0; i < k; i++) {
            t += nums[i];
        }
        double res = t;
        for (int i = k; i < nums.length; i++) {
            t += nums[i];
            t -= nums[i - k];
            res = Math.max(t, res);
        }
        return res / (k * (1.0));
    }
}
