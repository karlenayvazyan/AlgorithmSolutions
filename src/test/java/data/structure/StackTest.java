package data.structure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void test() {
        int first = 12;
        int second = 13;
        int three = 14;
        int four = 15;

        stack.push(first);
        stack.push(second);
        stack.push(three);
        stack.push(four);

        int pop1 = stack.pop();
        int pop2 = stack.pop();
        int pop3 = stack.pop();
        int pop4 = stack.pop();

        Assert.assertEquals(four, pop1);
        Assert.assertEquals(three, pop2);
        Assert.assertEquals(second, pop3);
        Assert.assertEquals(first, pop4);
    }

    @Test
    public void test_1() {
        int first = 12;
        int second = 13;
        int three = 14;
        int four = 15;

        stack.push(first);
        stack.push(second);
        stack.push(three);
        stack.push(four);

        int pop1 = stack.peek();
        int pop2 = stack.peek();
        int pop3 = stack.peek();
        int pop4 = stack.peek();

        Assert.assertEquals(four, pop1);
        Assert.assertEquals(four, pop2);
        Assert.assertEquals(four, pop3);
        Assert.assertEquals(four, pop4);
    }

    @Test
    public void test_2() {
        int first = 12;
        int second = 13;
        int three = 14;
        int four = 15;

        stack.push(first);
        stack.push(second);
        stack.push(three);
        stack.push(four);

        Assert.assertFalse(stack.isEmpty());

        int pop1 = stack.pop();
        int pop2 = stack.pop();
        int pop3 = stack.pop();
        int pop4 = stack.pop();

        Assert.assertTrue(stack.isEmpty());
    }
}