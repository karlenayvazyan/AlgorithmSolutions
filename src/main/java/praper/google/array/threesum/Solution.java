package praper.google.array.threesum;

import java.util.*;

class Solution {

    public boolean threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        // [|1, |2, 3, 4, 5, 7, |8] , 10

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int result = nums[i] + nums[left] + nums[right];
                if (result == target) {
                    return true;
                } else if (result > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                int result = nums[i] + nums[left] + nums[right];
                if (result == 0) {
                    List<Integer> num = List.of(nums[i], nums[left], nums[right]);
                    if (!resultList.contains(num)) {
                        resultList.add(num);
                    }
                    left++;
                } else if (result > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.threeSum(new int[]{1, -1, 0}, -1));
//        System.out.println(solution.threeSum(new int[]{3, 7, 1, 2, 8, 4, 5}, 10));

        System.out.println(solution.threeSum(new int[]{0, 0, 0, 0}));
        System.out.println(solution.threeSum(new int[]{1, -1, 0}));
        System.out.println(solution.threeSum(new int[]{3, 7, 1, 2, 8, 4, 5}));
    }

    private static void printArr(int[] ints) {
        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println();
    }
}