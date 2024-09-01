package interview150.medium;

import interview150.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 103. 二叉树的锯齿形层序遍历
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        boolean flag = true;
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            Deque<Integer> list = new ArrayDeque<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if (flag) {
                    list.offerLast(node.val);
                } else {
                    list.offerFirst(node.val);
                }
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);

            }
            res.add(new ArrayList<>(list));
            flag = !flag;
        }
        return res;
    }
}
