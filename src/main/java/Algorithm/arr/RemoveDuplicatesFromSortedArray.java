package Algorithm.arr;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return 1;
        int leftP = 0;
        for (int rightP = 0; rightP < nums.length; rightP++) {
            if (nums[leftP] != nums[rightP]) {
                nums[++leftP] = nums[rightP];
            }
        }
        return leftP + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};
        print(nums);
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
        print(nums);
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        print(nums);
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
        print(nums);
    }

    private static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.println();
    }
}
