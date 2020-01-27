package Algorithm.str;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrStrTest {

    private final StrStr str = new StrStr();

    @Test
    public void strStr_1() {
        String haystack = "hello", needle = "ll";
        int i = str.strStr(haystack, needle);
        assertEquals(2, i);
    }

    @Test
    public void strStr_2() {
        String haystack = "aaaaa", needle = "bba";
        int i = str.strStr(haystack, needle);
        assertEquals(-1, i);
    }

    @Test
    public void strStr_3() {
        String haystack = "", needle = "";
        int i = str.strStr(haystack, needle);
        assertEquals(0, i);
    }

    @Test
    public void strStr_4() {
        String haystack = "aaa", needle = "aaaa";
        int i = str.strStr(haystack, needle);
        assertEquals(-1, i);
    }

    @Test
    public void strStr_5() {
        String haystack = "mississippi", needle = "issip";
        int i = str.strStr(haystack, needle);
        assertEquals(4, i);
    }
}