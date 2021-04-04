package 周赛.week_21_4_4;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-04
 */
public class Solution5722 {
    public String truncateSentence(String s, int k) {
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                t++;
            }
            if (t==k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}
