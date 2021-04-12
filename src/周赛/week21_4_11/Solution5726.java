package 周赛.week21_4_11;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-11
 */
public class Solution5726 {
    public int arraySign(int[] nums) {
        int res = 0;
        for (int i : nums) {
            if (0 == i) return 0;
            else if (i < 0) res++;
        }
        return res % 2 == 0 ? 1 : -1;
    }
}
