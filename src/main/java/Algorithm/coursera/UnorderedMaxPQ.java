package Algorithm.coursera;

import java.util.Comparator;

public class UnorderedMaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int size;

    public UnorderedMaxPQ(int capacity) {
        this.pq = (Key[]) new Comparator[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(Key key) {
        this.pq[size++] = key;
    }

    public Key delMax() {
        int max = 0;
        for (int i = 1; i < pq.length; i++)
            if (less(max, i)) max = i;
        swap(max, size - 1);
        return pq[--size];
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void swap(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}
