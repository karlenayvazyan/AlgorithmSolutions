package Algorithm.ll;

import Algorithm.ll.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNNodeFromLastTest {

    private RemoveNNodeFromLast removeNNodeFromLast = new RemoveNNodeFromLast();

    @Test
    public void test_1() {
        ListNode listNode = removeNNodeFromLast.removeNthFromEnd(new ListNode(1, new ListNode(2,
                new ListNode(3,  new ListNode(4, new ListNode(5))))), 2 );
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5)))), listNode);
    }

    @Test
    public void test_2() {
        ListNode listNode = removeNNodeFromLast.removeNthFromEnd(new ListNode(1), 1);
        assertNull(listNode);
    }

    @Test
    public void test_3() {
        ListNode listNode = removeNNodeFromLast.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2);
        assertEquals(new ListNode(2), listNode);
    }

    @Test
    public void test_4() {
        ListNode listNode = removeNNodeFromLast.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1);
        assertEquals(new ListNode(1), listNode);
    }
}