package Algorithm.coursera;

import org.junit.Test;
import util.BaseTest;

public class ShellSortTest extends BaseTest {

    private final ShellSort shellSort = new ShellSort();

    @Test
    public void sortTest() {
        int[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        printArr(arr);
        shellSort.sort(arr);
        printArr(arr);
    }
}