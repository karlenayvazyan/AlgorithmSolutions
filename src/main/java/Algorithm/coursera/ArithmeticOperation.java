package Algorithm.coursera;

import data.structure.Stack;

public class ArithmeticOperation {

    public static void main(String[] args) {
        new ArithmeticOperation().printValue("(1+((2+3)*(5*4)))");
    }

    public void printValue(String str) {
        Stack<Double> val = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '+':
                case '*': ops.push(c);
                case '(': break;
                case ')':
                    Character operator = ops.pop();
                    Double first = val.pop();
                    Double second = val.pop();
                    if (operator.equals('+')) {
                        val.push(first + second);
                    } else if (operator.equals('*')) {
                        val.push(first * second);
                    }
                    break;
                default:
                    val.push(Double.parseDouble(String.valueOf(c)));
            }
        }
        System.out.println(val.pop());
    }
}
