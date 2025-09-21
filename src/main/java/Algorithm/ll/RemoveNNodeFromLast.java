package Algorithm.ll;

import Algorithm.ll.model.ListNode;

import java.util.List;

public class RemoveNNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = dummy;
        int leftIndex = 0;
        int rightIndex = 0;

        while (right.next != null) {
            if (n != (rightIndex - leftIndex)) {
                rightIndex++;
                right = right.next;
            } else {
                left = left.next;
                right = right.next;
                rightIndex++;
                leftIndex++;
            }
        }
        left.next = left.next.next;
        return dummy.next;
    }
}
