package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-28
 */
public class Solution0896 {
    public boolean isMonotonic(int[] A) {
        return fun1(A) || fun2(A);
    }

    public boolean fun1(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] < A[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean fun2(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] > A[i]) {
                return false;
            }
        }
        return true;
    }
}
