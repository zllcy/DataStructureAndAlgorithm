package interview150.medium;

import interview150.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 148. 排序链表
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            nodeList.add(temp);
            temp = temp.next;
            temp.next = null;
        }
        nodeList.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        if (nodeList.size() == 0) {
            return null;
        }
        ListNode newHead = nodeList.get(0);
        for (int i = 0; i < nodeList.size(); i++) {
            if (i == nodeList.size() - 1) {
                nodeList.get(i).next = null;
            } else {
                nodeList.get(i).next = nodeList.get(i + 1).next;
            }
        }
        return newHead;
    }
}
