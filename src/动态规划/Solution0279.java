package 动态规划;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-30
 */
public class Solution0279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            dp[i * i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    /*
        HashMap<Integer, Integer> map = new HashMap<>();

        public int numSquares(int n) {
            init();
            return bfs(n);
        }

        private int bfs(int n) {
            if (map.containsKey(n)) {
                return map.get(n);
            }
            int res = n;
            for (int i = 1; i < Math.sqrt(n); i++) {
                res = Math.min(res, bfs(n - i * i) + 1);
            }
            map.put(n, res);
            return res;
        }

        private void init() {
            for (int i = 1; i < 100; i++) {
                map.put(i * i, 1);
            }
        }
    */

    public static void main(String[] args) {
        new Solution0279().numSquares(12);
    }
}

