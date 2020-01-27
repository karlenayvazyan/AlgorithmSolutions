package Algorithm.str;

import Algorithm.str.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefixTest_1() {
        String[] strings = {"flower", "flow", "flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("fl", result);
    }

    @Test
    public void longestCommonPrefixTest_2() {
        String[] strings = {"dog", "racecar", "car"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("", result);
    }

    @Test
    public void longestCommonPrefixTest_3() {
        String[] strings = {"a"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("a", result);
    }

    @Test
    public void longestCommonPrefixTest_4() {
        String[] strings = {""};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("", result);
    }

    @Test
    public void longestCommonPrefixTest_5() {
        String[] strings = {"aa", "aa"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("aa", result);
    }

    @Test
    public void longestCommonPrefixTest_6() {
        String[] strings = {};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("", result);
    }

    @Test
    public void longestCommonPrefixTest_7() {
        String[] strings = {"", ""};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("", result);
    }

    @Test
    public void longestCommonPrefixTest_8() {
        String[] strings = {"abca", "aba", "aaab"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        Assert.assertEquals("a", result);
    }
}