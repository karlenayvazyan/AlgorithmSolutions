package Algorithm.arr;

import java.util.Arrays;

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, index = 0, length = 0;
        int[] result = new int[nums2.length];
        boolean isContinue = true;
        while (isContinue) {
            if (nums1[i] == nums2[j]) {
                result[index++] = nums1[i];
                i++; j++; length++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
            if (i == nums1.length || j == nums2.length) {
                isContinue = false;
            }
        }
        return Arrays.copyOf(result, length);
    }
}
