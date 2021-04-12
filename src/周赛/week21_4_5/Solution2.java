package 周赛.week21_4_5;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-05
 */
public class Solution2 {
    public int orchestraLayout(int num, int xPos, int yPos) {
        int[][] arr = generateMatrix(num);
        return arr[xPos][yPos];
    }

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 0, count = (n + 1) / 2;
        int num = 1;
        while (i < count) {
            for (int j = i; j < n - i; j++) {
                ans[i][j] = num++;
                num = num % 9;
            }
            for (int j = i + 1; j < n - i; j++) {
                ans[j][n - i - 1] = num++;
                num = num % 9;
            }
            for (int j = n - i - 2; j >= i + 1 && (n - 1 - i) != i; j--) {
                ans[n - i - 1][j] = num++;
                num = num % 9;
            }
            for (int j = n - i - 1; j >= i + 1 && (n - 1 - i) != i; j--) {
                ans[j][i] = num++;
                num = num % 9;
            }
            i++;
        }
        return ans;
    }
}
