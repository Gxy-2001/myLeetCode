package 每日一题;

import java.util.Arrays;

/**
 * @program: 每日一题
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-07
 */
public class Solution0665 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 8};
        new Solution0665().checkPossibility(arr);
    }

    public boolean checkPossibility(int[] nums) {
        //前向传播
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }
}
