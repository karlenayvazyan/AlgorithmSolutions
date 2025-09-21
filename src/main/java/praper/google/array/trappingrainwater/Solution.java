package praper.google.array.trappingrainwater;

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        int result = 0;

        while (left < right) {
            if (maxLeft <= maxRight) {
                result += Math.max(0, maxLeft - height[left]);
                maxLeft = Math.max(maxLeft, height[left]);
                left++;
            } else {
                result += Math.max(0, maxRight - height[right]);
                maxRight = Math.max(maxRight, height[right]);
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}