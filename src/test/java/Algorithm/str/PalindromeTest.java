package Algorithm.str;

import Algorithm.str.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    public void test_1() {
        String str = "A man, a plan, a canal: Panama";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertTrue(palindrome);
    }

    @Test
    public void test_2() {
        String str = "race a car";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertFalse(palindrome);
    }

    @Test
    public void test_3() {
        String str = " ";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertTrue(palindrome);
    }

    @Test
    public void test_4() {
        String str = "a.";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertTrue(palindrome);
    }

    @Test
    public void test_5() {
        String str = "ab";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertFalse(palindrome);
    }

    @Test
    public void test_6() {
        String str = "ab@a";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertTrue(palindrome);
    }

    @Test
    public void test_7() {
        String str = "0P";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertFalse(palindrome);
    }

    @Test
    public void test_8() {
        String str = "\"Suit no regrets.\" A motto, Master Gerontius.";
        boolean palindrome = this.palindrome.isPalindrome(str);
        assertTrue(palindrome);
    }
}
