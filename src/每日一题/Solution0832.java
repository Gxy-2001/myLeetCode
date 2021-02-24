package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-24
 */
public class Solution0832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] s : A) {
            int left = 0;
            int right = s.length - 1;
            while (left <= right) {
                int temp = s[left] ^ 1;
                s[left] = s[right] ^ 1;
                s[right] = temp;
                left++;
                right--;
            }
        }
        return A;
    }
}
