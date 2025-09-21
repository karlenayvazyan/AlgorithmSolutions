package praper.google.array.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        printArr(ints);
        ints = solution.twoSum(new int[]{3, 2, 4}, 6);
        printArr(ints);
        ints = solution.twoSum(new int[]{3, 3}, 6);
        printArr(ints);
    }

    private static void printArr(int[] ints) {
        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println();
    }
}