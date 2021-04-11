package 其他;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS4 {
    public int solution(String S) {
        char[] arr = S.toCharArray();
        int[] a = new int[arr.length];
        int[] b = new int[arr.length];
        for (int i = 1; i < a.length; i++) {
            if (arr[i - 1] == 'B') b[i] = b[i - 1] + 1;
            else b[i] = b[i - 1];
        }
        for (int i = a.length - 2; i >= 0; --i) {
            if (arr[i + 1] == 'A') a[i] = a[i + 1] + 1;
            else a[i] = a[i + 1];
        }
        int res = a[0];
        for (int i = 0; i < a.length; i++) {
            res = Math.min(res,a[i]+b[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        new MS4().solution("BAAABAB");
    }
    public int minimumDeletions(String s) {
        char[] arr = s.toCharArray();
        int[] a = new int[arr.length];
        int[] b = new int[arr.length];
        for (int i = 1; i < a.length; i++) {
            if (arr[i - 1] == 'b') b[i] = b[i - 1] + 1;
            else b[i] = b[i - 1];
        }
        for (int i = a.length - 2; i >= 0; --i) {
            if (arr[i + 1] == 'a') a[i] = a[i + 1] + 1;
            else a[i] = a[i + 1];
        }
        int res = a[0];
        for (int i = 0; i < a.length; i++) {
            res = Math.min(res,a[i]+b[i]);
        }
        return res;
    }
}
