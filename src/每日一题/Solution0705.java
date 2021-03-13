package 每日一题;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-13
 */
public class Solution0705 {
    class MyHashSet {
        int BASE = 769;
        ArrayList<LinkedList<Integer>> hashSet = new ArrayList<>();

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            for (int i = 0; i < BASE; i++) {
                hashSet.add(new LinkedList<>());
            }
        }

        public void add(int key) {
            int t = key % BASE;
            LinkedList<Integer> list = hashSet.get(t);
            if (!list.contains(key)) {
                list.add(key);
            }
        }

        public void remove(int key) {
            int t = key % BASE;
            LinkedList<Integer> list = hashSet.get(t);
            list.remove((Integer) key);
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            int t = key % BASE;
            LinkedList<Integer> list = hashSet.get(t);
            return list.contains(key);
        }
    }
}
