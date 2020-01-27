package Algorithm.arr;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

//    public void rotate(int[] nums, int k) {
//        if (k >= nums.length) return;
//        int[] tempArray = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            tempArray[(i + k) % nums.length] = nums[i];
//        }
//        System.arraycopy(tempArray, 0, nums, 0, nums.length);
//    }

//    public void rotate(int[] nums, int k) {
//        for (int j = 0; j < k; j++) {
//            for (int i = nums.length - 1; i > 0; i--) {
//                swap(nums, i - 1, i);
//            }
//        }
//    }
//
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
