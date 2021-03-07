package 周赛.week21_3_6;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-06
 */
public class Solution5681 {
    public static void main(String[] args) {
        System.out.println(new Solution5681().checkPowersOfThree(12));
    }

    public boolean checkPowersOfThree(int n) {
        String s = Integer.toString(n, 3);
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
