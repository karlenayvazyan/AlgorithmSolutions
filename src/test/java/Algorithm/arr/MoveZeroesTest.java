package Algorithm.arr;

import Algorithm.arr.MoveZeroes;
import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void moveZeroesTest_1() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        int[] expected = {1, 3, 12, 0, 0};
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void moveZeroesTest_2() {
        int[] nums = {1, 0, 1};
        moveZeroes.moveZeroes(nums);
        int[] expected = {1, 1, 0};
        Assert.assertArrayEquals(expected, nums);
    }
}