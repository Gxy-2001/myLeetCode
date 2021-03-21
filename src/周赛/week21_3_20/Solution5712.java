package 周赛.week21_3_20;

import java.util.Arrays;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-21
 */
public class Solution5712 {

    public int getMaximumConsecutive(int[] coins) {
        /*
        给你一个长度为 n 的整数数组 coins ，它代表你拥有的 n 个硬币。第 i 个硬币的值为 coins[i] 。
        如果你从这些硬币中选出一部分硬币，它们的和为 x ，那么称，你可以 构造 出 x 。
        请返回从 0 开始（包括 0 ），你最多能 构造 出多少个连续整数。
        你可能有多个相同值的硬币。
         */
        /*
        有一个很恶心的地方，是他从0开始，也就是说无论如何都包括0
        例如数组是[5,6,7,8,9],结果应该是1
        这是最恶心的
         */
        int res = 0;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > res + 1) {
                break;
            } else {
                res += i;
            }
        }
        //加一因为还有一位0
        return 1 + res;
    }
}
