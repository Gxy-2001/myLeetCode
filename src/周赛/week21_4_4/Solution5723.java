package 周赛.week21_4_4;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-04
 */
public class Solution5723 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            if (map.containsKey(logs[i][0])) {
                map.get(logs[i][0]).add(logs[i][1]);
            } else {
                HashSet<Integer> set = new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0], set);
            }
        }
        for (Integer i : map.keySet()) {
            HashSet<Integer> set = map.get(i);
            res[set.size() - 1]++;
        }
        return res;
    }
}
