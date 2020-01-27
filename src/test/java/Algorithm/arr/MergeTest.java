package Algorithm.arr;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTest {

    private final Merge merge = new Merge();

    @Test
    public void test_1() {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge.merge(arr1, 3, arr2, 3);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void test_2() {
        int[] arr1 = {2, 0};
        int[] arr2 = {1};
        merge.merge(arr1, 1, arr2, 1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}