package leetCode.array.maxConsecutiveOnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(2, solution.findMaxConsecutiveOnes(nums));
    }
}