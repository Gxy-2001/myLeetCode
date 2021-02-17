package 每日一题;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-05
 */
public class Solution1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int l = 0, r = 0;
        int usedCost = 0;
        while (r < n) {
            usedCost += Math.abs(t.charAt(r) - s.charAt(r));
            r++;
            if (usedCost > maxCost) {
                usedCost -= Math.abs(t.charAt(l) - s.charAt(l));
                l++;
            }
        }
        return n - l;
    }
}
