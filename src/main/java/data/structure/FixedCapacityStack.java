package data.structure;

public class FixedCapacityStack<T> {

    private T[] stack;
    private int size;

    public FixedCapacityStack(int capacity) {
        stack = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T pop() {
        T s = stack[--size];
        stack[size] = null;
        return s;
    }

    public void push(T s) {
        if (size == stack.length)
            resize(stack.length * 2);
        stack[size++] = s;
    }

    public void resize(int capacity) {
        T[] s = (T[]) new Object[capacity];
        for (int i = 0; i < stack.length; i++)
            s[i] = stack[i];
        stack = s;
    }
}
