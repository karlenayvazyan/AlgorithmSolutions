package Algorithm.cash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCash {
    private final Map<String, Node> map;
    private int capacity;

    private final LinkedList<Node> list;

    public LRUCash(int capacity) {
        this.map = new HashMap<>(capacity);
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    public void put(String key, String value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.setValue(value);
            list.remove(node);
            list.addFirst(node);
        } else {
            Node node = new Node(key, value);
            list.addFirst(node);
            map.put(key, node);
        }
    }

    public String get(String key) {
        Node node = map.get(key);
        if (node != null) {
            list.remove(node);
            list.addFirst(node);
            return node.getValue();
        }
        return null;
    }
}
