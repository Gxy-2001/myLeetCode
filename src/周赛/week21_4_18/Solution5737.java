package 周赛.week21_4_18;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-18
 */
public class Solution5737 {
    public int getXORSum(int[] arr1, int[] arr2) {
        int s = 0;
        for (int num : arr2) {
            s ^= num;
        }
        int ans = 0;
        for (int num : arr1) {
            ans ^= (num & s);
        }
        return ans;
    }

}
