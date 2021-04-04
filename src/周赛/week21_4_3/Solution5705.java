package 周赛.week21_4_3;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-03
 */
public class Solution5705 {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0) - 'a' + 1;
        int b = coordinates.charAt(1) - '0';
        return( a + b )% 2 == 1;
    }
}
