package Algorithm.ll;

import Algorithm.ll.PalindromeLinkedList;
import Algorithm.ll.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    public void isPalindromeTest_1() {
        ListNode node = new ListNode(1, new ListNode(2));
        boolean palindrome = palindromeLinkedList.isPalindrome(node);
        Assert.assertFalse(palindrome);
    }
}