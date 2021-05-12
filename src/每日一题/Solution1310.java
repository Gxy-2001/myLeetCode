package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-05-12
 */
public class Solution1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (arr[i] ^ arr[i - 1]);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int p = queries[i][0], q = queries[i][1];
            if (p == 0) {
                res[i] = arr[q];
            } else {
                res[i] = (arr[q] ^ arr[p - 1]);
            }
        }
        return res;
    }
}
