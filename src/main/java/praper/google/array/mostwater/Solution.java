package praper.google.array.mostwater;

public class Solution {
    public static int containerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // [1,0,3,0,1,2]
    // left = 0, right = left + 2, middle = left + 1
    // min(1, 0) * (1 - 0) = 1
    //
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containerWithMostWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}