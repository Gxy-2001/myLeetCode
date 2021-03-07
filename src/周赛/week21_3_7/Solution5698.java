package 周赛.week21_3_7;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-07
 */
public class Solution5698 {
    public int minElements(int[] nums, int limit, int goal) {
        double res = 0;
        for (int num : nums) {
            res += num;
        }
        return (int) Math.ceil(Math.abs(goal - res) / limit);
    }
}
