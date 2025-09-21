package Algorithm.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

//    public int singleNumber(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            result ^= nums[i];
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int [] arr = {3, -2, 100, -54, -2, 1000};
        System.out.println(new SingleNumber().singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>(nums.length);
        for (int current : nums) {
            if (!numSet.add(current)) {
                return current;
            }
        }
        throw new IllegalStateException();
    }

//    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1])
//                return nums[i];
//        }
//        return nums[nums.length - 1];
//    }
}