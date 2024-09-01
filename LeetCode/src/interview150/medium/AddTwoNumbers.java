package interview150.medium;

import interview150.ListNode;

/**
 * 2. 两数相加
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int accNum = 0;
        ListNode head = new ListNode();
        ListNode temp = null;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + accNum;
            if (temp == null) {
                temp = new ListNode(sum % 10);
                head.next = temp;
            } else {
                temp.next = new ListNode(sum % 10);
                temp = temp.next;
            }
            accNum = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + accNum;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            accNum = sum / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + accNum;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            accNum = sum / 10;
            l2 = l2.next;
        }

        if (accNum != 0) {
            temp.next = new ListNode(accNum);
        }

        return head.next;
    }
}
