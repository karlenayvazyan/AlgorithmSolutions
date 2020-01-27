package Algorithm.coursera;

public class ShellSort {

    public void sort(int[] arr) {
        int h = getH(arr.length);
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j-h]); j--) {
                    swap(arr, j, j - h);
                }
            }
            h = h / 3;
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

    private int getH(int length) {
        int h = 1;
        while (h < length) h = h * 3 + 1;
        return h;
    }
}
