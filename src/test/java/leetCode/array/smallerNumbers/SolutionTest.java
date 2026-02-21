package leetCode.array.smallerNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, res);
    }

    @Test
    public void test2() {
        int[] nums = {6, 5, 4, 8};
        int[] res = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(new int[]{2, 1, 0, 3}, res);
    }

    @Test
    public void test3() {
        int[] nums = {7, 7, 7, 7};
        int[] res = solution.smallerNumbersThanCurrent(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, res);
    }
}