package 周赛.week_21_4_5;


import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-05
 */
public class Solution1 {
    public int purchasePlans(int[] nums, int target) {
        // write your code here
        if (nums.length == 0) return 0;
        if (nums.length == 1) return target >= 2 * nums[0] ? 1 : 0;
        Arrays.sort(nums);

        int res = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] <= target) {
                res = (res + (j - i)) % 1000000007;
                i++;
            } else
                j--;
        }

        return res;
    }
}
