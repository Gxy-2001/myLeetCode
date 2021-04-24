package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-18
 */
public class Solution0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 1, right = 1;
        while (right < nums.length) {
            if (nums[right - 1] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
