package 周赛.week_21_3_14;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-14
 */
public class Solution5704 {
    public static void main(String[] args) {
        int[] arr = {6569, 9667, 3148, 7698, 1622, 2194, 793, 9041, 1670, 1872};

        new Solution5704().maximumScore(arr, 5);
    }

    public int maximumScore(int[] nums, int k) {
        int i = k, j = k;
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (i >= 0 && j < nums.length) {
            min = Math.min(nums[i], min);
            min = Math.min(nums[j], min);
            max = Math.max(min * (j - i + 1), max);
            if (i == 0) j++;
            else if (j == nums.length - 1) i--;
            else if (nums[i - 1] < nums[j + 1]) j++;
            else i--;
        }
        return max;
    }
}
