package 贪心;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-20
 */
public class Solution0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0;
        for (int i = 0; i < gas.length; i++) {
            gas[i] = gas[i] - cost[i];
            t += gas[i];
        }
        if (t < 0) {
            return -1;
        }
        int res = 0, i = 0;
        for (t = 0; i < gas.length; i++) {
            t += gas[i];
            if (t < 0) {
                t = 0;
                res = i + 1;
            }
        }
        return res == i ? -1 : res;
    }
}
