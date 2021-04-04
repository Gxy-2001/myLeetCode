package 周赛.week21_4_3;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-03
 */
public class Solution5708 {
    public int countNicePairs(int[] nums) {
        int[] margin = new int[nums.length];
        long ans = 0L;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            margin[i] = nums[i] - reverse(nums[i]);
            set.add(margin[i]);
        }


        for (Integer item : set) {
            long count = 0;
            for (int i = 0; i < margin.length; i++) {
                if (margin[i] == item) {
                    count++;
                }
            }

            ans += count * (count - 1) / 2;
        }

        return (int) (ans % 1000000007);
    }

    int reverse(int i) {
        int res = 0;
        while (i > 0) {
            res = res * 10;
            res += i % 10;
            i /= 10;
        }
        return res;
    }
}
