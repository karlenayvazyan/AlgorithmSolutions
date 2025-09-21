package Algorithm;

import java.math.BigInteger;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FibonacciWithCash {

    private final Map<Integer, BigInteger> cash = new HashMap<>();

    private BigInteger calculateFibonacci(int arg) {
        if (arg < 1) throw new IllegalArgumentException();
        if (arg <= 2) return BigInteger.ONE;
        return fibonacci(arg - 1).add(fibonacci(arg - 2));
    }

    public BigInteger fibonacci(int arg) {
        BigInteger value = cash.get(arg);
        if (value == null) {
            value = calculateFibonacci(arg);
            cash.put(arg, value);
        }
        return value;
    }

    public int findDuplicate(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i += 2) {
            if (numbers[i] != numbers[i + 1])
                return numbers[i];
        }
        return numbers[numbers.length - 1];
    }
}
