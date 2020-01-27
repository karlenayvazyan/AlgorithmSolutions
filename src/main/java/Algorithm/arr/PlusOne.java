package Algorithm.arr;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] current = new int[digits.length + 1];
        current[0] = 1;
        return current;
    }

//    public int[] plusOne(int[] digits) {
//        int last = digits.length - 1;
//        if (digits[last] != 9) {
//            digits[last] += 1;
//        } else if (digits.length == 1) {
//            digits = Arrays.copyOf(digits, digits.length + 1);
//            digits[digits.length - 1] = (digits[last] + 1) % 10;
//            digits[digits.length - 2] = (digits[last] + 1) / 10;
//        } else {
//            return changeNumber(digits, digits.length - 1);
//        }
//        return digits;
//    }
//
//    private int[] changeNumber(int[] digits, int i) {
//        int[] current = digits;
//        if (i == 0 && digits[i] == 9) {
//            current = Arrays.copyOf(digits, digits.length + 1);
//            current[i] = 1;
//            return current;
//        } else if (current[i] != 9) {
//            current[i] += 1;
//            return current;
//        } else {
//            current = changeNumber(current, i - 1);
//            current[i] = 0;
//            return current;
//        }
//    }

//    public int[] plusOne(int[] digits) {
//        int last = digits.length - 1;
//        int lastDigit = digits[last];
//        int plusOne = plusOne(digits, last);
//        if (lastDigit < 9) {
//            digits[last] = plusOne;
//        } else {
//            if (digits[0] == 9) {
//                digits = Arrays.copyOf(digits, digits.length + 1);
//            }
//            int index = digits.length - 1;
//            while (plusOne > 0) {
//                digits[index--] = plusOne % 10;
//                plusOne = plusOne / 10;
//            }
//        }
//        return digits;
//    }
//
//    public int plusOne(int[] digits, int i) {
//        if (i < 0) return 1;
//        else if (digits[i] == 9) return plusOne(digits, i - 1) * 10;
//        else return digits[i] + 1;
//    }
}
