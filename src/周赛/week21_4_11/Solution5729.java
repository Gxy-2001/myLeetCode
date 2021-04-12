package 周赛.week21_4_11;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-11
 */
public class Solution5729 {
    public static void main(String[] args) {
        MKAverage a = new MKAverage(6, 1);
        a.addElement(3);
        a.addElement(1);
        a.addElement(10);
        a.addElement(5);
        a.addElement(3);
        a.addElement(4);

        int i = a.calculateMKAverage();
        System.out.println(i);
    }
}

class MKAverage {
    static int m;
    static int k;
    Queue<Integer> queue = new LinkedList<>();

    public MKAverage(int m, int k) {
        this.m = m;
        this.k = k;
    }

    public void addElement(int num) {
        queue.add(num);
        if (queue.size() > m) {
            int i = queue.poll();
        }
    }

    public int calculateMKAverage() {
        if (queue.isEmpty() || queue.size() < m) {
            return -1;
        }
        Integer[] array = queue.toArray(new Integer[0]);
        Arrays.sort(array);
        double res = 0;
        for (int i = k; i < array.length - k; i++) {
            res += array[i];
        }
        return (int) (res / (array.length - 2 * k));
    }
}


