package 周赛.week21_4_3;

import java.util.LinkedList;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-03
 */
public class Solution5706 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] chang = sentence1.split(" ");
        String[] duan = sentence2.split(" ");
        boolean[] arr = new boolean[chang.length];
        if (chang.length == 0 || duan.length == 0) {
            return true;
        }
        int l1 = 0, l2 = 0;
        while (l1 < chang.length && l2 < duan.length) {
            if (chang[l1].equals(duan[l2])) {
                arr[l1] = true;
                l1++;
                l2++;
            } else {
                l1++;
            }
        }
        if (l2 != duan.length) return false;
        boolean b = false;
        for (int i = 0; i < chang.length; i++) {
            if (arr[i])
                b = true;
        }
        if (b == false) return false;
        int i = 0;
        for (; i < chang.length; i++) {
            if (!arr[i]) break;
        }
        for (; i < chang.length && !arr[i]; ++i) {
        }
        for (; i < chang.length && arr[i]; ++i) {

        }
        return i == chang.length;
    }

    public static void main(String[] args) {
        new Solution5706().areSentencesSimilar("M", "MyHaley");
        System.out.println(" ".split(" ").length);
    }
}
