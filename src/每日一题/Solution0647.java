package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-08
 */
public class Solution0647 {
    private int num;
    char[] arr;

    public int countSubstrings(String s) {
        arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count(i, i);
            count(i, i + 1);
        }
        return num;
    }

    private void count(int i, int j) {
        while (i >= 0 && j < arr.length && arr[i] == arr[j]) {
            i--;
            j++;
            num++;
        }
    }
}
