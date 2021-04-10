package 每日一题;

import java.util.Scanner;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-07
 */
public class newCoder2 {
}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        double[][] dp = new double[m][m];
        for (int i = 0; i < m; i++) {
            dp[i][i] = arr[i];
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                double t = 0;
                int nn = n, tem = 0;
                for (int k = j; k >= Math.max(j - nn + 1, i); k--) {
                    tem += arr[j];
                    t = Math.max(t, tem);
                }
                dp[i][j] = (int) Math.max(dp[i][j - 1], t);
            }
        }
        double res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                double t1 = 0, t2 = 0;
                if (i != 0)
                    t1 = dp[0][i - 1];
                if (j != m - 1)
                    t2 = dp[j + 1][m-1];
                res = Math.max(res, dp[i][j] + Math.max(t1, t2));
            }
        }
        System.out.println((int) res);
    }
}
