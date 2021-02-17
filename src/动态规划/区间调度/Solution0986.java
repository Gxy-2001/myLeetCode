package 动态规划.区间调度;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            // 交集区间的左端，取它们的较大者
            int start = Math.max(A[i][0], B[j][0]);
            // 交集区间的右端，取它们的较小者
            int end = Math.min(A[i][1], B[j][1]);
            // 形成了交集区间
            if (start <= end) {
                res.add(new int[]{start, end});
            }
            // 谁先结束，谁的指针就步进，考察下一个子区间
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
