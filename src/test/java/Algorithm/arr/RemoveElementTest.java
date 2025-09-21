package Algorithm.arr;

import org.junit.Test;
import util.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementTest extends BaseTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void test_0() {
        int[] nums = {1};
        printArr(nums);
        assertEquals(0, removeElement.removeElement(nums, 1));
        printArr(nums);
    }

    @Test
    public void test_1() {
        int[] nums = new int[]{3, 2, 2, 3};
        printArr(nums);
        assertEquals(2, removeElement.removeElement(nums, 3));
        printArr(nums);
    }

    @Test
    public void test_2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        printArr(nums);
        assertEquals(5, removeElement.removeElement(nums, 2));
        printArr(nums);
    }

    @Test
    public void test_3() {
        int[] nums = new int[]{3, 3};
        printArr(nums);
        assertEquals(0, removeElement.removeElement(nums, 3));
        printArr(nums);
    }
}