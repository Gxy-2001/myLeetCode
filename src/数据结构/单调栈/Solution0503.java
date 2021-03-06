package 数据结构.单调栈;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-06
 */
public class Solution0503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] map = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            map[nums[i % n]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % n]);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map[nums[i]];
        }
        return res;
    }
}
