package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-05-27
 */
public class Solution0461 {

    public int hammingDistance(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if (x % 2 != y % 2) {
                res++;
            }
            x /= 2;
            y /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution0461().hammingDistance(2, 4);
    }

}
