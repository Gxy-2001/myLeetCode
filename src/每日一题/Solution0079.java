package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-04-01
 */
public class Solution0079 {
    char[][] board;
    String word;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        char s = word.charAt(0);
        boolean[][] f = new boolean[board.length][board[0].length];
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == s && dfs(i, j, 0, f)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int x, int y, int index, boolean[][] f) {
        if (index == word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length
                || y < 0 || y >= board[0].length
                || board[x][y] != word.charAt(index)) {
            return false;
        }
        if (!f[x][y]) {
            f[x][y] = true;
            if (dfs(x + 1, y, index + 1, f)
                    || dfs(x - 1, y, index + 1, f)
                    || dfs(x, y + 1, index + 1, f)
                    || dfs(x, y - 1, index + 1, f)) {
                return true;
            }
            f[x][y] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };
        new Solution0079().exist(board, "SEE");
    }
}
