package 其他;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS2 {

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] < K)
            //A[n - 1] != K is error
            //&& is error
            return false;
        else
            return true;
    }
}
