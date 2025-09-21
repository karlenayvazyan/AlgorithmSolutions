package praper.google.linkedlist.palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        List<Integer> dummyArray = new ArrayList<>();
        while (curr != null) {
            dummyArray.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = dummyArray.size() - 1;
        while (left < right) {
            if (dummyArray.get(left).equals(dummyArray.get(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        logger.info(String.valueOf(solution.isPalindrome(new ListNode(1, new ListNode(2)))));
        logger.info(String.valueOf(solution.isPalindrome(
                        new ListNode(1,
                        new ListNode(2,
                        new ListNode(2,
                        new ListNode(1)))))));
    }
}