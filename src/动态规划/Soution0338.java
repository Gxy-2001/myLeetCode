package 动态规划;


/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-03
 */
public class Soution0338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        if (num != 0) {
            res[1] = 1;
        }
        for (int i = 1; i < res.length / 2 + 1; i++) {
            if (2 * i < res.length) {
                res[2 * i] = res[i];
            }
            if (2 * i + 1 < res.length) {
                res[2 * i + 1] = res[i] + 1;
            }
        }
        return res;
    }

}
