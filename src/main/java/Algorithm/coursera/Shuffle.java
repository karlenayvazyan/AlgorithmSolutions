package Algorithm.coursera;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    public void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            int randomIndex = random.nextInt(i);
            swap(array, randomIndex, i);
        }
        Arrays.copyOf(array, array.length);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
