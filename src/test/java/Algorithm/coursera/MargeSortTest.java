package Algorithm.coursera;

import org.junit.Test;
import util.BaseTest;

public class MargeSortTest extends BaseTest {

    private final MargeSort margeSort = new MargeSort();

    @Test
    public void sortTest() {
        int[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        printArr(arr);
        margeSort.sort(arr);
        printArr(arr);
    }
}