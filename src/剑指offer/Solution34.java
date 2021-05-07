package 剑指offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-05-07
 */
public class Solution34 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root != null)
            dfs(root, target);
        return res;
    }

    private void dfs(TreeNode root, int target) {
        temp.add(root.val);
        if (root.left == null && root.right == null && target == root.val) {
            res.add(new LinkedList<>(temp));
        }
        if (root.left != null) {
            dfs(root.left, target - root.val);
        }
        if (root.right != null) {
            dfs(root.right, target - root.val);
        }
        temp.removeLast();
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        s.pathSum(t1, 4);
    }
}
