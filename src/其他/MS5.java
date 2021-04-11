package 其他;

import java.util.LinkedList;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS5 {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] arr = S.toCharArray();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                list.add(i);
            }
        }
        if (list.isEmpty()) return 0;
        int mid = list.get(list.size() / 2);
        double res = 0;
        for (Integer i : list) {
            res += (mid > i ? mid - i : i - mid);
            if (res > 1000000000) {
                return -1;
            }
        }
        return (int) (res - (list.size() - 1));
    }

    public static void main(String[] args) {
        new MS5().solution("WRRWWR");
    }
}
