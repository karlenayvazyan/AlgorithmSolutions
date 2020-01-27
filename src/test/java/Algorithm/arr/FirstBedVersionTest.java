package Algorithm.arr;

import org.junit.Assert;
import org.junit.Test;

public class FirstBedVersionTest {

    private final FirstBedVersion bedVersion = new FirstBedVersion();

    @Test
    public void test_1() {
        int result = bedVersion.firstBadVersion(5);
        Assert.assertEquals(4, result);
    }
}