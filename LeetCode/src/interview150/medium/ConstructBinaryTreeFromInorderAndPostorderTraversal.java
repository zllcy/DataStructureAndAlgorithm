package interview150.medium;

import interview150.TreeNode;

import java.util.HashMap;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    HashMap<Integer,Integer> map = new HashMap<>();
    int[] post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0;i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        post = postorder;
        TreeNode root = buildTree(0, inorder.length - 1, 0, post.length - 1);
        return root;
    }

    public TreeNode buildTree(int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {
        if(inorderEnd < inorderStart || postorderEnd < postorderStart) return null;

        int root = post[postorderEnd];
        int rootIndexInInorderArray = map.get(root);

        TreeNode node = new TreeNode(root);
        node.left = buildTree(inorderStart, rootIndexInInorderArray - 1, postorderStart, postorderStart + rootIndexInInorderArray - inorderStart - 1);
        node.right = buildTree(rootIndexInInorderArray + 1, inorderEnd, postorderStart + rootIndexInInorderArray - inorderStart, postorderEnd - 1);
        return node;
    }
}
