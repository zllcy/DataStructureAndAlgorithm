package interview150.simple;

import interview150.TreeNode;

/**
 * 222. 完全二叉树的节点个数
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.right) + countNodes(root.left) + 1;
    }
}
