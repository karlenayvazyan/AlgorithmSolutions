package Algorithm;

import org.junit.Test;

import java.math.BigInteger;

public class FibonacciWithCashTest {

    private final FibonacciWithCash fibonacciWithCash = new FibonacciWithCash();

    @Test
    public void fibonacciTest() {
        BigInteger fibonacci = fibonacciWithCash.fibonacci(100);
        System.out.println(fibonacci);
    }
}