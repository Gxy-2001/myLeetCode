package 动态规划;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0887 {
    public int superEggDrop(int K, int N) {
        int T = 1;
        while (calcF(K, T) < N + 1) {
            T++;
        }
        return T;
    }

    int calcF(int K, int T) {
        if (T == 1 || K == 1) {
            return T + 1;
        }
        return calcF(K - 1, T - 1) + calcF(K, T - 1);
    }

}
