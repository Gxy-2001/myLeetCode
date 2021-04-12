package 周赛.week21_4_5;

import java.util.PriorityQueue;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-05
 */
public class Solution3 {
    public int magicTower(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] < 0) return -1;
            else return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> i1 - i2);
        long  res = 0, pre = 0, tem = 0;
        double sum = 1;
        for (int i : nums) {
            sum += i;
        }
        if (sum <= 0) return -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                tem = nums[i] + 1;
            } else {
                tem = pre + nums[i];
            }
            if (nums[i] < 0) pq.add(nums[i]);
            boolean b = false;
            while (tem <= 0) {
                if (pq.isEmpty() || b) break;
                else if (!b && nums[i] == pq.peek()) {
                    tem -= pq.poll();
                    res++;
                    //b = true;
                } else {
                    tem -= pq.poll();
                    res++;
                }
            }
            pre = tem;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int[] ar = {100, 100, 100, -2050, -50, -250, -50, -50, 10000, 150};
        new Solution3().magicTower(ar);
    }
}
