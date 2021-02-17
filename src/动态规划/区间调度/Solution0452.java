package 动态规划.区间调度;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length < 1) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int now = points[0][1];
        for (int[] point : points) {
            if (point[0] > now) {
                count++;
                now = point[1];
            }
        }
        return count;
    }
}
