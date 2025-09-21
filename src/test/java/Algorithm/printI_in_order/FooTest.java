package Algorithm.printI_in_order;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FooTest {

    private Foo foo = new Foo();

    @Test
    public void test_1() throws InterruptedException {
        Thread t1 = new Thread();
        foo.first(t1);
        Thread t2 = new Thread();
        foo.second(t2);
        Thread t3 = new Thread();
        foo.third(t3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}