package 周赛.week21_3_6;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-06
 */
public class Solution5680 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res = Integer.MAX_VALUE, t = -1;
        for (int i = 0; i < points.length; ++i) {
            int[] point = points[i];
            if (point[0] == x) {
                if (res > Math.abs(point[1] - y)) {
                    res = Math.abs(point[1] - y);
                    t = i;
                }
            } else if (point[1] == y) {
                if (res > Math.abs(Math.abs(point[0] - x))) {
                    res = Math.abs(point[0] - x);
                    t = i;
                }
            }
        }
        return t;
    }
}
