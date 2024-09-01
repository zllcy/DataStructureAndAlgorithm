package interview150.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 117. 填充每个节点的下一个右侧节点指针 II
 */
public class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            Node temp = null;
            for (int i = 0; i < size; i++) {
                Node node = deque.poll();
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
                if (i != 0) {
                    temp.next = node;
                }
                temp = node;
            }
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
