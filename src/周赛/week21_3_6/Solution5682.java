package 周赛.week21_3_6;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-06
 */
public class Solution5682 {
    public static void main(String[] args) {
        new Solution5682().beautySum("aabcb");
    }

    public int beautySum(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int[] dic = new int[26];
            dic[arr[i] - 'a']++;
            dic[arr[i + 1] - 'a']++;
            for (int j = i + 2; j < arr.length; j++) {
                dic[arr[j] - 'a']++;
                res += find(dic);

            }
        }
        return res;
    }

    private int find(int[] arr) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]!=0&&arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
