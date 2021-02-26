package 每日一题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-26
 */
public class Solution1178 {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int key = 0;
            for (char ch : word.toCharArray()) {
                key |= 1 << ch - 'a';
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Integer> res = new ArrayList<>(puzzles.length);
        for (String p : puzzles) {
            char[] puzzle = p.toCharArray();
            res.add(dfs(puzzle, 1, map, 1 << puzzle[0] - 'a'));// 首字符必选
        }
        return res;
    }

    public int dfs(char[] puzzle, int idx, Map<Integer, Integer> map, int key) {
        if (idx == puzzle.length) {
            return map.getOrDefault(key, 0);
        }
        // 首字符之外的字符可选可不选，两种情况
        return dfs(puzzle, idx + 1, map, key) + dfs(puzzle, idx + 1, map, key | 1 << puzzle[idx] - 'a');
    }
}
