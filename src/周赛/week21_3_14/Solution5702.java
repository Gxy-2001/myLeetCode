package 周赛.week21_3_14;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-14
 */
public class Solution5702 {
    public int findCenter(int[][] edges) {
        int res1 = edges[0][0], res2 = edges[0][1];
        for (int i = 1; i < edges.length; i++) {
            int[] edge = edges[i];
            if (res1 == edge[0] || res1 == edge[1]) {
                return res1;
            } else {
                return res2;
            }
        }
        return 0;
    }
}
