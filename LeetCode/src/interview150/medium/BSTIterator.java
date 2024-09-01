package interview150.medium;

import interview150.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 173. 二叉搜索树迭代器
 */
public class BSTIterator {
    private int idx;
    private List<Integer> list;

    public BSTIterator(TreeNode root) {
        idx = 0;
        list = new ArrayList<>();
        inorder(root, list);
    }

    public int next() {
        return list.get(idx++);
    }

    public boolean hasNext() {
        return idx < list.size();
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
