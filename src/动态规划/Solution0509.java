package 动态规划;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-09
 */
public class Solution0509 {
    public int fib(int N) {
        if(N==0){
            return 0;
        }
        int res = 1;
        int a = 0, b = 1;
        for (int i = 0; i < N-1; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
