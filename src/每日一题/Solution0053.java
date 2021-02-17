package 每日一题;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-08
 */
public class Solution0053 {
    public int maxSubArray(int[] nums) {
        int res = nums[0], t = 0;
        for (int i : nums) {
            t += i;
            res = Math.max(t, res);
            if (t < 0) t = 0;
        }
        return res;
    }
}
