package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-30
 */
public class Solution0260 {
    public int[] singleNumber(int[] nums) {
        int group1 = 0, group2 = 0;
        int diff = 0, bit = 1;
        for (int num : nums) {
            diff ^= num;
        }
        while ((diff & bit) == 0) {
            bit <<= 1;
        }
        for (int num : nums) {
            if ((num & bit) != 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }
        return new int[]{group1, group2};
    }
}
