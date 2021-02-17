package 动态规划.区间调度;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description: 贪心算法，按照起点排序：选择结尾最短的，后面才可能连接更多的区间（如果两个区间有重叠，应该保留结尾小的）
 * 把问题转化为最多能保留多少个区间，使他们互不重复，则按照终点排序，每个区间的结尾很重要，结尾越小，则后面越有可能容纳更多的区间。
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 1) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int now = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] >= now) {
                count++;
                now = interval[1];
            }
        }
        return intervals.length - count;
    }
}
