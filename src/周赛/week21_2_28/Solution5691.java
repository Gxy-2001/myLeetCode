package 周赛.week21_2_28;


/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-28
 */
public class Solution5691 {
    public static void main(String[] args) {
        int[] arr1 = {6, 6};
        int[] arr2 = {1};
        new Solution5691().minOperations(arr1, arr2);
    }

    public int minOperations(int[] nums1, int[] nums2) {
        int[] arr = new int[6];
        int sum = 0;
        for (int i : nums1) {
            sum += i;
        }
        for (int i : nums2) {
            sum -= i;
        }
        if (sum == 0) {
            return 0;
        }
        int res = 0;
        if (sum < 0) {
            //nums2大，大数可以变小数
            for (int i : nums2) {
                arr[i - 1]++;
            }
            for (int i : nums1) {
                arr[6 - i]++;
            }
            int i = 5;
            while (i >= 0) {
                if (arr[i] > 0) {
                    sum += i;
                    res++;
                    arr[i]--;
                }
                if (sum >= 0) {
                    return res;
                }
                if (arr[i] == 0) {
                    i--;
                }
            }
        } else {
            for (int i : nums1) {
                arr[i - 1]++;
            }
            for (int i : nums2) {
                arr[6 - i]++;
            }
            int i = 5;
            while (i >= 0) {
                if (arr[i] > 0) {
                    sum -= i;
                    res++;
                    arr[i]--;
                }
                if (sum <= 0) {
                    return res;
                }
                if (arr[i] == 0) {
                    i--;
                }
            }
        }
        return -1;
    }
}
