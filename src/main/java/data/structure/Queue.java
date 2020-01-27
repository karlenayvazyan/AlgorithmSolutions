package data.structure;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    public void add(T item) {
        Node<T> n = new Node<>(item);
        if (last != null)
            last.next = n;
        last = n;
        if (first == null)
            first = n;
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T value = first.value;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return value;
    }

    public T peek() {
        if (first== null) throw new NoSuchElementException();
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
