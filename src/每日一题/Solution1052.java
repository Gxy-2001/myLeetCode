package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-24
 */
public class Solution1052 {
    public static void main(String[] args) {

        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int X = 3;
        new Solution1052().maxSatisfied(customers, grumpy, X);
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int res = 0;
        for (int i = 0; i < customers.length; i++) {
            if (i < X || grumpy[i] == 0) {
                res += customers[i];
            }
        }
        int t = res;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                res += customers[i];
            }
            if (grumpy[i - X] == 1) {
                res -= customers[i - X];
            }
            t = Math.max(res, t);
        }
        return t;
    }
}
