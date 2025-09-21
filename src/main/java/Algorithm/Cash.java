package Algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cash<K, V> extends LinkedHashMap<K, V> {

    private final int maxSize;

    public Cash(int capacity, int maxSize) {
        super(capacity);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return maxSize > size();
    }
}
