package leetCode.array.findMaxAverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        assertEquals(12.75000, solution.findMaxAverage(nums, 4));
    }

    @Test
    void test2() {
        int[] nums = {5};
        assertEquals(5.00000, solution.findMaxAverage(nums, 1));
    }
}