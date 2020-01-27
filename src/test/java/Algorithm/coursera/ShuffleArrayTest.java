package Algorithm.coursera;

import org.junit.Test;
import util.BaseTest;

public class ShuffleArrayTest extends BaseTest {

    private final Shuffle shuffle = new Shuffle();

    @Test
    public void sortTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArr(arr);
        shuffle.shuffleArray(arr);
        printArr(arr);
    }
}