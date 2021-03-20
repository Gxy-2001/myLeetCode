package 周赛.week21_3_14;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-14
 */
public class Solution5701 {
    public static void main(String[] args) {
        new Solution5701().areAlmostEqual("abcd","dcba");
    }
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                if (help(s1, s2, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean help(String s1, String s2, int i, int j) {
        char[] arr = s1.toCharArray();
        arr[i] = s1.charAt(j);
        arr[j] = s1.charAt(i);
        return s2.equals(new String(arr));
    }
}
