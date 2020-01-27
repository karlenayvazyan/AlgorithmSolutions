import org.junit.Test;

public class Solution {
    
//    private int[] nums;
//
//    public Solution(int[] nums) {
//        this.nums = nums;
//    }
    
    /** Resets the array to its original configuration and return it. */
//    public int[] reset() {
//        return nums;
//    }
    
    /** Returns a random shuffling of the array. */
    @Test
    public void shuffle() {
        int[] nums = {1, 2, 3};
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            arr[index++] = nums[i];
        }
        for (int value : arr) {
            System.out.print(value);
        }
    }
}