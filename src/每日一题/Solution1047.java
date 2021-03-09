package 每日一题;

import java.util.Stack;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-09
 */
public class Solution1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }else {
                stack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }
        return str.toString();
    }
}
