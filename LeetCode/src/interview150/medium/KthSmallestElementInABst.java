package interview150.medium;

import interview150.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 230. 二叉搜索树中第 K 小的元素
 */
public class KthSmallestElementInABst {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, 0, list);
        return list.get(k - 1);
    }

    public void inOrder(TreeNode node, int k, List<Integer> list) {
        if (node == null || list.size() == k) return;
        inOrder(node.left, k, list);
        list.add(node.val);
        inOrder(node.right, k, list);
    }
}
