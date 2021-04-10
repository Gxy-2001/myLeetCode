package 每日一题;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-07
 */
public class newCoder1 {
}
// 本题为考试多行输入输出规范示例，无需提交，不计分。

class Main {
    static char[] m = {')', '!', '@', '#', '$', '%', '^', '&', '*', '(',};
    static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        //)!@#$%^&*(
        //0123456789
        map.put(')', '0');
        map.put('!', '1');
        map.put('@', '2');
        map.put('#', '3');
        map.put('$', '4');
        map.put('%', '5');
        map.put('^', '6');
        map.put('&', '7');
        map.put('*', '8');
        map.put('(', '9');
        map.put('0', ')');
        map.put('1', '!');
        map.put('2', '@');
        map.put('3', '#');
        map.put('4', '$');
        map.put('5', '%');
        map.put('6', '^');
        map.put('7', '&');
        map.put('8', '*');
        map.put('9', '(');
        map.put('-','-');
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sS1 = sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            helper(s[0], s[1]);
        }

    }

    private static void helper(String s1, String s2) {
        char[] array = s1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = map.get(array[i]);
        }
        BigInteger I1 = new BigInteger(new String(array));
        array = s2.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = map.get(array[i]);
        }
        BigInteger I2 = new BigInteger(new String(array));
        String S1 = I1.add(I2).toString();
        String S2 = I1.subtract(I2).toString();
        String S3 = I2.subtract(I1).toString();
        array = S1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = map.get(array[i]);
        }
        System.out.println(new String(array));
        array = S2.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = map.get(array[i]);
        }
        System.out.println(new String(array));
        array = S3.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = map.get(array[i]);
        }
        System.out.println(new String(array));
    }
}
