package interview150.medium;

import interview150.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int n2 = count - n;
        if (n2 == 0) {
            return head.next;
        }
        count = 0;
        temp = head;
        while (temp != null) {
            if (count != n2 - 1) {
                temp = temp.next;
                count++;
                continue;
            }
            if (temp.next == null) {
                temp.next = null;
                break;
            }
            temp.next = temp.next.next;
            break;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode listNode = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1);
    }
}
