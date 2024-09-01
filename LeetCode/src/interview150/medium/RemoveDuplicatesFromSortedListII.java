package interview150.medium;

import interview150.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode t1 = dummyNode;
        ListNode t2 = t1.next;
        while (t2 != null && t2.next != null) {
            if (t1.next.val != t2.next.val) {
                t1 = t1.next;
                t2 = t1.next;
            } else {
                while (t1 != null && t1.next != null && t2 != null && t2.next != null
                        && t1.next.val == t2.next.val) {
                    t2 = t2.next;
                }
                t2 = t2.next;
                t1.next = t2;
            }

        }

        return dummyNode.next;
    }
}
