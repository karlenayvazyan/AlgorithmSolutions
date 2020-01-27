package data.structure;

public class StackOfStrings {

    private Node first;

    private class Node {
        String item;
        Node next;
    }

    public void push(String str) {
        Node old = first;
        first = new Node();
        first.item = str;
        first.next = old;
    }

    public String pop() {
        Node current = first;
        first = first.next;
        return current.item;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
