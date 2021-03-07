package 周赛.week21_3_7;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-07
 */
public class Solution5697 {
    public boolean checkOnesSegment(String s) {
        if (s.equals(s.replaceAll("1", ""))) {
            return true;
        }
        boolean b = true;
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                break;
            }
        }
        for (; i < s.length() && s.charAt(i) == '1'; i++) {
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}
