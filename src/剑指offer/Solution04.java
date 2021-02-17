package 剑指offer;

/**
 * @program: 每日一题
 * @description: 二维数组中的查找
 * @author: Gxy-2001
 * @create: 2021-02-01
 */
class Solution04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
        //请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int i = 0, j = matrix[0].length - 1; i < matrix.length && j >= 0; ) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
