package Algorithm.arr;

import Algorithm.arr.SingleNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    public void singldeNumberTest_1() {
        int[] nums = {2, 2, 1};
        int i = singleNumber.singleNumber(nums);
        assertEquals(1, i);
    }

    @Test
    public void singldeNumberTest_2() {
        int[] nums = {4, 1, 2, 1, 2};
        int i = singleNumber.singleNumber(nums);
        assertEquals(4, i);
    }
}