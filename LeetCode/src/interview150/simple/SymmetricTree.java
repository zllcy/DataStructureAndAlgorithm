package interview150.simple;

import interview150.TreeNode;

/**
 * 101. 对称二叉树
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return checkLR(root.left, root.right);

    }

    private boolean checkLR(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        return checkLR(left.left, right.right) && checkLR(left.right, right.left);
    }
}
