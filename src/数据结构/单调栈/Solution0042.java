package 数据结构.单调栈;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-27
 */
public class Solution0042 {
    public int trap(int[] height) {
        int res = 0, leftMax = 0, rightMax = 0, left = 0, right = height.length - 1;
        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left++];
            } else {
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right--];
            }
        }
        return res;
    }
}
