package Algorithm.coursera;

public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = minIndex(arr, i);
            swap(arr, i, j);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int minIndex(int[] arr, int fromIndex) {
        int minIndex = fromIndex;
        for (int i = fromIndex + 1; i < arr.length; i++)
            if (arr[minIndex] > arr[i]) minIndex = i;
        return minIndex;
    }
}
