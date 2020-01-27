package Algorithm.coursera;

import org.junit.Test;

public class QuickFindUFTest {

    @Test
    public void testQuickFindUF_1() {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6, 5);
        quickFindUF.union(9, 4);
        quickFindUF.union(2, 1);
        quickFindUF.union(5, 0);
        quickFindUF.union(7, 2);
        quickFindUF.union(6, 1);
        quickFindUF.union(7, 3);
        int[] id = quickFindUF.getId();
        printArray(id);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}