package Algorithm.arr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MaxProfit2Test {

    private final MaxProfit2 maxProfit = new MaxProfit2();

    @Test
    public void maxProfit_1() {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int i = maxProfit.maxProfit(arr);
        assertEquals(7, i);
    }

    @Test
    public void maxProfit_2() {
        int[] arr = {1, 2, 3, 4, 5};
        int i = maxProfit.maxProfit(arr);
        assertEquals(4, i);
    }

    @Test
    public void maxProfit_3() {
        int[] arr = {7, 6, 4, 3, 1};
        int i = maxProfit.maxProfit(arr);
        assertEquals(0, i);
    }

    @Test
    public void maxProfit_4() {
        int[] arr = {6, 1, 3, 2, 4, 7};
        int i = maxProfit.maxProfit(arr);
        assertEquals(7, i);
    }
}