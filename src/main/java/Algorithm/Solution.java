package Algorithm;

class Solution {
    
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i = nums.length - 3; i >= 0; i--) {
            arr[index++] = nums[i];
        }
        return arr;
    }
}