package 其他;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-10
 */
public class MS3 {
    public int solution(String S) {
        // write your code in Java SE 8
        boolean[] hashTable = new boolean[26];
        char[] chars = S.toCharArray();
        for (char c : chars) {
            hashTable[c - 'a'] = !hashTable[c - 'a'];
        }
        int res = 0;
        for (boolean b : hashTable) {
            if (b) res++;
        }
        return res;
    }

}
