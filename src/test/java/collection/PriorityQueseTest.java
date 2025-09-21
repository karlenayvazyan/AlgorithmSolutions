package collection;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueseTest {

    @Test
    public void test() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            priorityQueue.add(random.nextInt(100));
            if (priorityQueue.size() > 10)
                priorityQueue.poll();
        }
        System.out.println(priorityQueue);
    }
}
