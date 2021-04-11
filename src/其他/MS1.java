package 其他;


/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS1 {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        K = K % 7;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (S.equals(arr[i])) {
                t = i;
            }
        }
        return arr[(t + K) % 7];
    }
}
