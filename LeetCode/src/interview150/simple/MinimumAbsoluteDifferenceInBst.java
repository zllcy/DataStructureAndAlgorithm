package interview150.simple;

import interview150.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 530. 二叉搜索树的最小绝对差
 */
public class MinimumAbsoluteDifferenceInBst {
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        List<TreeNode> treeNodeList = new ArrayList<>();
        inorder(root, treeNodeList);
        for (int i = 0; i < treeNodeList.size() - 1; i++) {
            res = Math.min(res, treeNodeList.get(i + 1).val - treeNodeList.get(i).val);
        }
        return res;
    }

    private void inorder(TreeNode root, List<TreeNode> treeNodeList) {
        if (root == null) {
            return;
        }
        inorder(root.left, treeNodeList);
        treeNodeList.add(root);
        inorder(root.right, treeNodeList);
    }
}
