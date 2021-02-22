package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-20
 */
public class Solution5669 {
    public static void main(String[] args) {
        int[][] g = {{1, -1, -1}, {3, -2, 0}};

        int[] arr = {1, -1, 0, 1, -1, -1, 3, -2, 0};
        new Solution5669().canChoose(g, arr);
    }

    public boolean canChoose(int[][] groups, int[] nums) {
        int i = 0;
        int j = 0;
        while (i <= nums.length - groups[j].length) {
            if (nums[i] == groups[j][0]) {
                int k = 0;
                for (; k < groups[j].length; k++) {
                    if (nums[k + i] != groups[j][k]) {
                        break;
                    }
                }
                if (k == groups[0].length) {
                    i += (groups[j].length - 1);
                    j++;
                }
            }
            if (j == groups.length) {
                return true;
            }
            ++i;
        }
        return false;
    }
}
