package 动态规划;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-16
 */
public class Solution0354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });

        int[] h = new int[envelopes.length];
        for (int i = 0; i < h.length; i++) {
            h[i] = envelopes[i][1];
        }
        return lengthOfLIS(h);
    }

    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
