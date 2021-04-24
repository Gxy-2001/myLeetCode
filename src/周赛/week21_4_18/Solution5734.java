package 周赛.week21_4_18;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-18
 */
public class Solution5734 {
    public boolean checkIfPangram(String sentence) {
        boolean[]res = new boolean[26];
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            res[chars[i]-'a'] = true;
        }
        for (int i = 0; i < res.length; i++) {
            if(!res[i]){
                return false;
            }
        }
        return true;
    }
}
