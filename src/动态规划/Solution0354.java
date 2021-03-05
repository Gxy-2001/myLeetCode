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
        if (envelopes.length == 0) {
            return 0;
        }
        Arrays.sort(envelopes, (a, b) ->
                a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res + 1;
    }

}
