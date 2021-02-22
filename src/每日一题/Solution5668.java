package 每日一题;


/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-20
 */
public class Solution5668 {
    public static void main(String[] args) {
        new Solution5668().longestNiceSubstring("Bb");
    }

    public String longestNiceSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (j - i > max && helper(arr, i, j)) {
                    max = j - i;
                    res = s.substring(i, j + 1);
                }

            }
        }
        return res;
    }

    public boolean helper(char[] arr, int i, int j) {
        int[] xiao = new int[26];
        int[] da = new int[26];
        for (int k = i; k <= j; k++) {
            if (Character.isLowerCase(arr[k])) {
                xiao[arr[k] - 'a'] = 1;
            } else {
                da[arr[k] - 'A'] = 1;
            }
        }
        for (int k = 0; k < 26; k++) {
            if (xiao[k] != da[k]) {
                return false;
            }
        }
        return true;
    }
}
