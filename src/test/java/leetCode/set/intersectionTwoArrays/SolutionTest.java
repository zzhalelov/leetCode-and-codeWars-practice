package leetCode.set.intersectionTwoArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = solution.intersection(nums1, nums2);
        assertArrayEquals(new int[]{2}, res);
    }

    @Test
    public void test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] res = solution.intersection(nums1, nums2);
        assertArrayEquals(new int[]{4, 9}, res);
    }
}