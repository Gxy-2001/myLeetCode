package 周赛.week21_4_18;

import java.util.PriorityQueue;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-18
 */
public class Solution5736 {
    public int[] getOrder(int[][] tasks) {
        int[] res = new int[tasks.length];
        boolean[] b = new boolean[tasks.length];
        PriorityQueue<O> pq = new PriorityQueue<>();
        long time = 1;

        int t = 0;
        while (t < res.length) {
            for (int i = 0; i < res.length; i++) {
                if (!b[i] && tasks[i][0] <= time) {
                    O o = new O(tasks[i][0], tasks[i][1], i);
                    b[o.index] = true;
                    pq.add(o);
                }
            }
            if (pq.isEmpty()) {
                time++;
            } else {
                O poll = pq.poll();
                time += poll.time;
                res[t++] = poll.index;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{7,10},{7,12},{7,5},{7,4},{7,2}};
        new test().getOrder(arr2);
    }

    class O implements Comparable<O> {
        int start;
        int time;
        int index;

        public O(int start, int time, int index) {
            this.start = start;
            this.time = time;
            this.index = index;
        }

        @Override
        public int compareTo(O o) {
            if (this.time == o.time) {
                if (this.start == o.start) {
                    return this.index < o.index ? 1 : -1;
                }
                return this.start < o.start ? 1 : -1;
            }
            return this.time > o.time ? 1 : -1;
        }
    }
}
