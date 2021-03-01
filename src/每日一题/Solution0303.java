package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-01
 */
public class Solution0303 {
    class NumArray {
        int[] arr;
        int[] nums;

        public NumArray(int[] nums) {
            arr = new int[nums.length];
            this.nums = nums;
            if (nums.length != 0) {
                arr[0] = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    arr[i] = arr[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            if (arr.length == 0) {
                return 0;
            }
            return arr[j] - arr[i] + nums[i];
        }
    }
}
