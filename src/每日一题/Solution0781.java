package 每日一题;

import java.util.HashMap;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-04
 */
public class Solution0781 {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : answers) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        for (Integer x : map.keySet()) {
            int y = map.get(x);
            res += (x + y) / (x + 1) * (x + 1);
        }
        return res;
    }
}
