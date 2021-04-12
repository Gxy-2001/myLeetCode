package 周赛.week21_4_4;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-04
 */
public class Solution5724 {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int max = 0, index = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.abs(nums1[i] - nums2[i]);
            if (res[i] > max) {
                max = res[i];
                index = i;
            }
        }
        int num2 = nums2[index];
        int min = res[index];
        int ii = index;
        for (int i = 0; i < res.length; i++) {
            int i1 = Math.abs(num2 - nums1[i]);
            if (i1 < min) {
                min = i1;
                index = i;
            }
        }
        int t = 0;
        res[ii] = min;
        for (int i = 0; i < res.length; i++) {
            t = (t + res[i]) % 1000000007;
        }
        return t;
    }
}
