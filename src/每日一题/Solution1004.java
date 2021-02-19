package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-19
 */
public class Solution1004 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0,};
        int K = 3;
        System.out.println(new Solution1004().longestOnes(arr, K));
    }

    public int longestOnes(int[] A, int K) {
        int l = 0, r = 0, res = 0;
        while (r < A.length) {
            if (A[r] == 0) {
                if (K > 0) {
                    K--;
                } else {
                    while (A[l] == 1) {
                        l++;
                    }
                    l++;
                }
            }
            res = Math.max(res, ++r - l);
        }
        return res;
    }
}
