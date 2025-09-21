package Algorithm.ll;

import Algorithm.ll.Marge2List;
import Algorithm.ll.model.ListNode;
import org.junit.Test;

public class Marge2ListTest {

    private final Marge2List marge2List = new Marge2List();

    @Test
    public void test_1() {
        ListNode listNode = marge2List.mergeTwoLists(
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(4))),
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(4)))
        );
        printList(listNode);
    }

    @Test
    public void test_2() {
        ListNode listNode = marge2List.mergeTwoLists(
                new ListNode(2),
                new ListNode(1)
        );
        printList(listNode);
    }

    private void printList(ListNode listNode) {
        ListNode current = listNode;
        while (current != null) {
            System.out.print(current.val);
            System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }
}