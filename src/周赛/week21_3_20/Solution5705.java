package 周赛.week21_3_20;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-20
 */
public class Solution5705 {
    public int secondHighest(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        int max = -1;
        int max2 = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= '0' && array[i] <= '9') {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < max && array[i] > max2) {
                    max2 = array[i];
                }
            }
        }
        return max2 == -1 ? -1 : max2 - '0';
    }

    public static void main(String[] args) {
        new Solution5705().secondHighest("ck007");
    }
}
