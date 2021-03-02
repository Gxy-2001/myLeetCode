package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-02
 */
public class Solution0304 {
    class NumMatrix {
        int[][] arr;

        public NumMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }
            arr = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 1; i < matrix.length + 1; i++) {
                for (int j = 1; j < matrix[0].length + 1; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return arr[row2 + 1][col2 + 1] - arr[row1][col2 + 1] - arr[row2 + 1][col1] + arr[row1][col1];
        }
    }
}
