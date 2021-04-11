package 其他;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS6 {
    public int solution(int N) {
        // write your code in Java SE 8
        int d = digits(N);
        int res = N + 1, tar = d * 2;
        while (res>0) {
            if (digits(res) == tar)
                return res;
            res++;
        }
        return -1;
    }

    private int digits(int n) {
        int res = 0;
        while (n != 0) {
            res = res + n % 10;
            n = n / 10;
        }
        return res;
    }
}
