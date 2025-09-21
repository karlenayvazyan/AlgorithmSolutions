package praper.google.array.search_in_rotated_sorted_array;

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int counter = 0;
        while (left <= right) {
            int middle = (int) Math.floor((left + right) / 2);
            if (nums[middle] == target) {
                System.out.println(counter);
                return middle;
            }
            counter++;

            // left sorted portion
            if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target <= nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target >= nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            // nums = [4, 5, 6, 1, 2, 3] target = 3, left = 0, right = 5, middle = 2
            // nums = [4, 5, 6, |1, |2, |3] target = 3, left = 3, right = 5, middle = 4
            // nums = [4, 5, 6, |1, |2, |3] target = 3, left = 5, right = 5, middle = 5
        }
        System.out.println(counter);
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4, 5, 6, 1, 2, 3}, 3));
//        System.out.println(solution.search(new int[]{4, 5, 6, 1, 2, 3}, 3));
//        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
//        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
//        System.out.println(solution.search(new int[]{7, 0, 1, 2}, 3));
//        System.out.println(solution.search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8));
//        System.out.println(solution.search(new int[]{1}, 0));
    }

}