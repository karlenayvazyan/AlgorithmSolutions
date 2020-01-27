package Algorithm.arr;

import Algorithm.arr.RotateArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @Test
    public void rotate_1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 1;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, nums);
    }

    @Test
    public void rotate_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, nums);
    }

    @Test
    public void rotate_3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        assertArrayEquals(nums, new int[]{5, 6, 7, 1, 2, 3, 4});
    }

    @Test
    public void rotate_4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotateArray.rotate(nums, k);
        assertArrayEquals(nums, new int[]{4, 5, 6, 7, 1, 2, 3});
    }

    @Test
    public void rotate_5() {
        int[] nums = {-1};
        int k = 2;
        rotateArray.rotate(nums, k);
        assertArrayEquals(nums, new int[]{-1});
    }

    @Test
    public void rotate_6() {
        int[] nums = {1, 2};
        int k = 3;
        rotateArray.rotate(nums, k);
        assertArrayEquals(nums, new int[]{2, 1});
    }
}
