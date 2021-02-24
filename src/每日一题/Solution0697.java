package 每日一题;

import java.util.HashMap;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-20
 */
public class Solution0697 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        new Solution0697().findShortestSubArray(arr);
    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int[] arr = map.get(nums[i]);
                arr[0]++;
                arr[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }

        int max = 0;
        int res = 0;
        for (Integer i : map.keySet()) {
            int[] arr = map.get(i);
            int t = arr[0];
            if (t > max) {
                res = arr[2] - arr[1];
                max = t;
            } else if (t == max) {
                res = Math.min(res, arr[2] - arr[1]);
            }
        }
        return res + 1;
    }
}
