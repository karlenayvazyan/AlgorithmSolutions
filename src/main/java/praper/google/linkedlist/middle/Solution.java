package praper.google.linkedlist.middle;

import java.util.List;
import java.util.logging.Logger;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

class Solution {

    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        logger.info(String.valueOf(solution.middleNode(new ListNode(1, new ListNode(2)))));
        logger.info(String.valueOf(solution.middleNode(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(1)))))));
    }
}