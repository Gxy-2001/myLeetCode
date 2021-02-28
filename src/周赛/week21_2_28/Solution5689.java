package 周赛.week21_2_28;

import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-28
 */
public class Solution5689 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int key = 2;
        if (ruleKey.equals("type")) {
            key = 0;
        } else if (ruleKey.equals("color")) {
            key = 1;
        }
        for (List<String> item : items) {
            if (match(item, key, ruleValue)) {
                res++;
            }
        }
        return res;
    }

    public boolean match(List<String> item, int ruleKey, String ruleValue) {
        return item.get(ruleKey).equals(ruleValue);
    }
}
