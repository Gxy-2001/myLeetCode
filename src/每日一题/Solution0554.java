package 每日一题;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-05-02
 */
public class Solution0554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int t = 0;
        for (List<Integer> list : wall) {
            t = 0;
            for (Integer i : list) {
                t += i;
                map.put(t, map.getOrDefault(t, 0) + 1);
            }
        }
        map.remove(t);
        int res = 0;
        for (Integer i : map.values()) {
            res = Math.max(res, i);
        }
        return wall.size() - res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2, 1}, {3, 1, 2},};
        List<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        List<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        List<List<Integer>> l = new LinkedList<>();
        l.add(l1);
        l.add(l2);
        new Solution0554().leastBricks(l);
    }
}
