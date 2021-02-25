package 剑指offer;


import javax.swing.tree.TreeNode;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-02-25
 */
public class Solution68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            int max = Math.max(p.val, q.val);
            int min = Math.min(p.val, q.val);
            int my = root.val;
            if (my > max) {
                root = root.left;
            } else if (my < min) {
                root = root.right;
            } else {
                return root;
            }
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
