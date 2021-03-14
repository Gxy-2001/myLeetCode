package 周赛.week_21_3_14;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-14
 */
public class Solution5703 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 5}, {2, 2}};
        new Solution5703().maxAverageRatio(arr, 2);
    }
    private class pair {
        float first;
        float second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public float getFirst() {
            return first;
        }


        public float getSecond() {
            return second;
        }


        public void addFirst() {
            this.first++;
        }

        public void addSecond() {
            this.second++;
        }

        public double get() {
            return this.first / this.second;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = 0;
        PriorityQueue<pair> queue = new PriorityQueue<>(new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return ((o1.getFirst() + 1.0) / (o1.getSecond() + 1.0) - o1.getFirst() / o1.getSecond() - ((o2.getFirst() + 1) / (o2.getSecond() + 1) - o2.getFirst() / o2.getSecond())) < 0 ? 1 : -1;
            }
        });

        for (int i = 0; i < classes.length; i++) {
            queue.add(new pair(classes[i][0], classes[i][1]));
        }
        while (n < extraStudents) {
            pair poll = queue.poll();
            poll.addFirst();
            poll.addSecond();
            queue.offer(poll);
            n++;
        }
        double ans = 0.0;
        for (int i = 0; i < classes.length; i++) {
            ans += queue.poll().get();
        }
        return ans / classes.length;
    }

    /*public double maxAverageRatio(int[][] classes, int extraStudents) {
        double[] pre = new double[classes.length];
        for (int i = 0; i < classes.length; i++) {
            int[] ints = classes[i];
            pre[i] = ints[0] * 1.0 / ints[1];
        }
        double[] pre1 = new double[classes.length];
        for (int i = 0; i < classes.length; i++) {
            int[] ints = classes[i];
            pre1[i] = (ints[0] + 1) * 1.0 / (ints[1] + 1);
        }

        for (int i = 0; i < extraStudents; i++) {
            int index = 0;
            double delta = 0;
            for (int j = 0; j < classes.length; j++) {
                if (pre[j] == 1) continue;
                double t = pre1[j] - pre[j];
                if (t > delta) {
                    delta = t;
                    index = j;
                }
            }
            pre[index] = pre1[index];
            int[] ints = classes[index];
            classes[index][0]++;
            classes[index][1]++;
            pre1[index] = (ints[0] + 1) * 1.0 / (ints[1] + 1);

        }
        double res = 0;
        for (int i = 0; i < classes.length; i++) {
            res += pre[i];
        }
        return res / classes.length;
    }*/
}
