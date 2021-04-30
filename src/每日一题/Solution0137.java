package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-30
 */
public class Solution0137 {
    public int singleNumber(int[] nums) {
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) == 1) {
                    arr[i]++;
                }
            }
        }
        int t = 1, res = 0;
        for (int i = 0; i < 32; i++) {
            if (arr[i] % 3 == 1) {
                res += t;
            }
            t *= 2;
        }
        return res;
    }
}
