package Algorithm.coursera;

import org.junit.Test;

public class SelectionSortTest {

    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    public void sortTest() {
        int[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        printArr(arr);
        selectionSort.sort(arr);
        printArr(arr);
    }

    private void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}