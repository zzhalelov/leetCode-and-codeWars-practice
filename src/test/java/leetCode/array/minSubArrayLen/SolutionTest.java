package leetCode.array.minSubArrayLen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, solution.minSubArrayLen(7, nums));
    }

    @Test
    void test2() {
        int[] nums = {1, 4, 4};
        assertEquals(1, solution.minSubArrayLen(4, nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(0, solution.minSubArrayLen(11, nums));
    }
}