package Algorithm.coursera;

public class InsertionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swapToPosition(arr, i);
        }
    }

    private void swapToPosition(int[] arr, int fromIndex) {
        for (int i = fromIndex; i > 0; i--) {
            if (less(arr[i], arr[i-1])) swap(arr, i, i - 1);
            else break;
        }
    }

    private boolean less(int i, int j) {
        return i < j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
