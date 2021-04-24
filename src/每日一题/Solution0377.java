package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-24
 */
public class Solution0377 {
    public int combinationSum4(int[] nums, int target) {
        int[] res = new int[target + 1];
        res[0] = 1;
        for (int i = 1; i < res.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) res[i] += res[i - nums[j]];
            }
        }
        return res[target];
    }
}
