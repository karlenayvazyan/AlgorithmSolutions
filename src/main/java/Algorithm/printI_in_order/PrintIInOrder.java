package Algorithm.printI_in_order;

import java.util.concurrent.atomic.AtomicBoolean;

class Foo {

    private final Object o = new Object();
    private AtomicBoolean isFirstPrinted = new AtomicBoolean(false);
    private AtomicBoolean isSecondPrinted = new AtomicBoolean(false);
    private AtomicBoolean isThirdPrinted = new AtomicBoolean(false);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (!isSecondPrinted.get())
            synchronized (o) {
                o.wait();
            }
        while (!isThirdPrinted.get())
            synchronized (o) {
                o.wait();
            }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstPrinted.set(true);
        notifyAll();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!isFirstPrinted.get())
            synchronized (o) {
                o.wait();
            }
        while (!isThirdPrinted.get())
            synchronized (o) {
                o.wait();
            }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        isSecondPrinted.set(true);
        notifyAll();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!isFirstPrinted.get())
            synchronized (o) {
                o.wait();
            }
        while (!isSecondPrinted.get())
            synchronized (o) {
                o.wait();
            }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        isThirdPrinted.set(true);
        notifyAll();
    }
}