package 每日一题;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums[0].length * nums.length != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int t = 0, h = nums[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = nums[t / h][t % h];
                t++;
            }
        }
        return res;
    }
}
