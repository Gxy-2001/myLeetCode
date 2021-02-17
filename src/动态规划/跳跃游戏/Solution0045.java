package 动态规划.跳跃游戏;

/**
 * @program: myLeetCode
 * @description: 绝了
 * @author: Gxy-2001
 * @create: 2021-02-17
 */
public class Solution0045 {
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
