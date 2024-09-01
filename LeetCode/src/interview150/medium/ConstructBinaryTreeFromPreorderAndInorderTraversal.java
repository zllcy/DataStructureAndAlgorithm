package interview150.medium;

import interview150.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, n-1, inorder, 0, n-1);
    }

    private TreeNode build(int[] preorder, int preorder_left, int preorder_right,
                           int[] inorder, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) return null;

        // 前序遍历第一个节点为根节点
        TreeNode root = new TreeNode(preorder[preorder_left]);

        // 定位中序遍历根节点的位置
        int inorder_root = map.get(preorder[preorder_left]);
        // 左子树的节点个数
        int size_left = inorder_root - inorder_left;

        // 递归创建左子树
        root.left = build(preorder, preorder_left + 1, preorder_left + size_left,
                inorder, inorder_left, inorder_root - 1);
        // 递归创建右子树
        root.right = build(preorder, preorder_left + size_left + 1, preorder_right,
                inorder, inorder_root + 1, inorder_right);

        return root;
    }
}
