package data.structure;


import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private final Queue<Integer> integerQueue = new Queue<>();

    @Test
    public void queueTest() {
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);

        assertFalse(integerQueue.isEmpty());

        int peek = integerQueue.peek();
        assertEquals(1, peek);
        integerQueue.remove();
        peek = integerQueue.peek();
        assertEquals(2, peek);
        integerQueue.remove();
        peek = integerQueue.peek();
        assertEquals(3, peek);
        integerQueue.remove();
        peek = integerQueue.peek();
        assertEquals(4, peek);
        integerQueue.remove();
        assertTrue(integerQueue.isEmpty());
    }
}