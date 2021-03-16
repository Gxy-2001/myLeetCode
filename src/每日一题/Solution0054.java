package 每日一题;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-15
 */
public class Solution0054 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> list = new Solution0054().spiralOrder(arr);
        System.out.println(list.toString());
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int t = Math.max((matrix.length + 1) / 2, (matrix[0].length + 1) / 2);
        int num = matrix.length * matrix[0].length, ii = 0;
        for (int i = 0; i < t; i++) {
            for (int j = i; j < matrix[0].length - i; j++) {
                ii++;
                res.add(matrix[i][j]);
                if (ii == num) return res;

            }
            for (int j = i + 1; j < matrix.length - i; j++) {
                ii++;
                res.add(matrix[j][matrix[0].length - i - 1]);
                if (ii == num) return res;

            }
            for (int j = matrix[0].length - i - 2; j >= i; j--) {
                ii++;
                res.add(matrix[matrix.length - i - 1][j]);
                if (ii == num) return res;

            }
            for (int j = matrix.length - i - 2; j > i; j--) {
                ii++;
                res.add(matrix[j][i]);
                if (ii == num) return res;

            }
        }
        return res;
    }


}
