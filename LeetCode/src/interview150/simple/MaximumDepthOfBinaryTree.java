package interview150.simple;

import interview150.TreeNode;

/**
 * 104. 二叉树的最大深度
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
