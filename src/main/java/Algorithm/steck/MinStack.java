package Algorithm.steck;

import java.util.ArrayList;
import java.util.List;

class MinStack {

    private Node top;
    private List<Integer> integerList;

    /** initialize your data structure here. */
    public MinStack() {
       integerList = new ArrayList<>();
    }
    
    public void push(int x) {
        integerList.add(x);
        Node n = new Node(x);
        if (top == null) {
            top = n;
        } else {
            n.preview = top;
            top = n;
        }
    }
    
    public void pop() {
        top = top.preview;
    }
    
    public int top() {
        return top.value;
    }

    public int getMin() {
        Node head = top;
        int min = head.value;
        while(head.preview != null) {
            if(min > head.preview.value) {
                min = head.preview.value;
            }
            head = head.preview;
        }
        return min;
    }
    
    private static final class Node {
        int value;
        Node preview;
        
        public Node(int value) {
            this.value = value;
        }
        
        public Node(int value, Node preview) {
            this.value = value;
            this.preview = preview;
        }
    }
}