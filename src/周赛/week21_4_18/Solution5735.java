package 周赛.week21_4_18;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-18
 */
public class Solution5735 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for (int i = 0; i < costs.length; i++) {
            coins = coins - costs[i];
            if(coins>=0)res++;else break;
        }
        return res;
    }
}
