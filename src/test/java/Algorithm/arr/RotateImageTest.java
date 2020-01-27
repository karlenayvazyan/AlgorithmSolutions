package Algorithm.arr;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    private final RotateImage rotateImage = new RotateImage();
/*
1 2 3 4

3 1 4 2
 */
    @Test
    public void rotateImageTest_1() {
        int[][] arr = {
                {1, 2}, {3, 4}
        };
        rotateImage.rotate(arr);
        int[][] result = {
                {3, 1}, {4, 2}
        };
        Assert.assertArrayEquals(result, arr);
    }

    @Test
    public void rotateImageTest_2() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateImage.rotate(arr);
        int[][] result = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        Assert.assertArrayEquals(result, arr);
    }

    @Test
    public void rotateImageTest_3() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        rotateImage.rotate(arr);
        int[][] result = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        Assert.assertArrayEquals(result, arr);
    }
}