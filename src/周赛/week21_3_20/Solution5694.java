package 周赛.week21_3_20;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-20
 */
public class Solution5694 {

}

class AuthenticationManager {
    static int time;

    public AuthenticationManager(int timeToLive) {
        time = timeToLive;
    }

    Map<String, LinkedList<Integer>> map = new HashMap<>();

    public void generate(String tokenId, int currentTime) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(currentTime);
        map.put(tokenId, l);
    }

    public void renew(String tokenId, int currentTime) {
        if (map.containsKey(tokenId)) {
            LinkedList<Integer> integers = map.get(tokenId);
            for (Integer i : integers) {
                if (currentTime >= i && i + time > currentTime) {
                    integers.add(currentTime);
                    return;
                }
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        for (LinkedList<Integer> list : map.values()) {
            for (Integer i : list) {
                if (currentTime >= i && i + time > currentTime) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
