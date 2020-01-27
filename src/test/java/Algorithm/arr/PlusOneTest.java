package Algorithm.arr;

import Algorithm.arr.PlusOne;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    public void plusOne_1() {
        int[] nums = {1, 2, 3};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {1, 2, 4};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void plusOne_2() {
        int[] nums = {4, 3, 2, 1};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {4, 3, 2, 2};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void plusOne_3() {
        int[] nums = {9};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {1, 0};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void plusOne_4() {
        int[] nums = {8, 9, 9, 9};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {9, 0, 0, 0};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void plusOne_5() {
        int[] nums = {9, 9};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {1, 0, 0};
        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void plusOne_6() {
        int[] nums = {1, 9};
        int[] ints = plusOne.plusOne(nums);
        int[] expected = {2, 0};
        Assert.assertArrayEquals(expected, ints);
    }
//
//    @Test
//    public void testReucursive_1() {
//        int[] nums = {9};
//        int i = plusOne.plusOne(nums, nums.length - 1);
//        Assert.assertEquals(10, i);
//    }
//
//    @Test
//    public void testReucursive_2() {
//        int[] nums = {1, 9};
//        int i = plusOne.plusOne(nums, nums.length - 1);
//        Assert.assertEquals(20, i);
//    }
//
//    @Test
//    public void testReucursive_3() {
//        int[] nums = {9, 9};
//        int i = plusOne.plusOne(nums, nums.length - 1);
//        Assert.assertEquals(100, i);
//    }
//
//    @Test
//    public void testReucursive_4() {
//        int[] nums = {9, 9, 9};
//        int i = plusOne.plusOne(nums, nums.length - 1);
//        Assert.assertEquals(1000, i);
//    }
}
