package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-16
 */
public class Solution0059 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 0, count = (n + 1) / 2;
        int num = 1;
        while (i < count) {
            for (int j = i; j < n - i; j++) {
                ans[i][j] = num++;
            }
            for (int j = i + 1; j < n - i; j++) {
                ans[j][n - i - 1] = num++;
            }
            for (int j = n - i - 2; j >= i + 1 && (n - 1 - i) != i; j--) {
                ans[n - i - 1][j] = num++;
            }
            for (int j = n - i - 1; j >= i + 1 && (n - 1 - i) != i; j--) {
                ans[j][i] = num++;
            }
            i++;
        }
        return ans;
    }
}
