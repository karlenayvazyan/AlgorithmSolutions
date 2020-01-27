package Algorithm.arr;

import Algorithm.arr.Intersect;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntersectTest {

    private final Intersect intersect = new Intersect();

    @Test
    public void intersect_1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersect = this.intersect.intersect(nums1, nums2);
        Assert.assertArrayEquals(new int[]{2, 2}, intersect);
    }

    @Test
    public void intersect_2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersect = this.intersect.intersect(nums1, nums2);
        Assert.assertArrayEquals(new int[]{4, 9}, intersect);
    }

    @Test
    public void intersect_3() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        int[] intersect = this.intersect.intersect(nums1, nums2);
        Assert.assertArrayEquals(new int[]{2}, intersect);
    }

    @Test
    public void intersect_4() {
        int[] nums1 = {61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81};
        int[] nums2 = {5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48};
        int[] intersect = this.intersect.intersect(nums1, nums2);
        int[] expecteds = {5, 4, 57, 79, 7, 89, 88, 45, 34, 92, 38, 85, 6, 0, 77, 44, 61};
        Arrays.sort(expecteds);
        Arrays.sort(intersect);
        Assert.assertArrayEquals(
                expecteds,
                intersect);
    }

    @Test
    public void intersect_5() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] intersect = this.intersect.intersect(nums1, nums2);
        int[] expecteds = {};
        Assert.assertArrayEquals(expecteds, intersect);
    }
}