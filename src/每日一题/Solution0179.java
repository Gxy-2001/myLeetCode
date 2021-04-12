package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-12
 */
public class Solution0179 {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, this::compareTo);
        return myString(arr);
    }

    private int compareTo(String o1, String o2) {
        return (o1.concat(o2)).compareTo((o2.concat(o1)));
    }

    private String myString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (String i : nums) {
            sb.append(i);
        }
        return sb.toString();
    }
}
