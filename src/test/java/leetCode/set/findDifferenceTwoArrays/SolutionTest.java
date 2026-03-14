package leetCode.set.findDifferenceTwoArrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<Integer> list1 = List.of(1, 3);
        List<Integer> list2 = List.of(4, 6);

        List<List<Integer>> res = List.of(list1, list2);

        assertEquals(res, solution.findDifference(nums1, nums2));
    }

    @Test
    public void test2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<Integer> list1 = List.of(3);
        List<Integer> list2 = List.of();

        List<List<Integer>> res = List.of(list1, list2);

        assertEquals(res, solution.findDifference(nums1, nums2));
    }
}