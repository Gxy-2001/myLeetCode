package 每日一题;

import java.util.HashSet;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-01
 */
class Solution0888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
            set.add(B[i]);
        }
        int delta = (sumA + sumB) / 2 - sumA;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i] + delta)) {
                return new int[]{A[i], A[i] + delta};
            }
        }
        return new int[]{};
    }
}