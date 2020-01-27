package Algorithm.str;

import Algorithm.str.CountAndSay;
import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    public void countAndSay_1() {
        int n = 1;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("1", result);
    }

    @Test
    public void countAndSay_2() {
        int n = 2;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("11", result);
    }

    @Test
    public void countAndSay_3() {
        int n = 3;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("21", result);
    }

    @Test
    public void countAndSay_4() {
        int n = 4;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("1211", result);
    }

    @Test
    public void countAndSay_5() {
        int n = 5;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("111221", result);
    }

    @Test
    public void countAndSay_6() {
        int n = 6;
        String result = countAndSay.countAndSay(n);
        Assert.assertEquals("312211", result);
    }
}