package 周赛.week21_4_11;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-11
 */
public class Solution5727 {

    public int findTheWinner(int n, int k) {
        int ans = 0, i = 0;
        for (i = 1; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans + 1;
    }

}
