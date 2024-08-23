package interview150.simple;

import interview150.TreeNode;

/**
 * 112. 路径总和
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.right, targetSum - root.val)
                || hasPathSum(root.left, targetSum - root.val);
    }
}
