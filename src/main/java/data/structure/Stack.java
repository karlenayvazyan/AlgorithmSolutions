package data.structure;

public class Stack<T> {

    private StackNode<T> last;

    public T pop() {
        T item = last.value;
        last = last.next;
        return item;
    }

    public T peek() {
        return last.value;
    }

    public void push(T item) {
        if (last == null) {
            last = new StackNode<>(item);
        } else {
            StackNode<T> current = new StackNode<>(item);
            current.next = last;
            last = current;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    private static final class StackNode<T> {
        private T value;
        private StackNode<T> next;

        public StackNode(T value) {
            this.value = value;
        }
    }
}
