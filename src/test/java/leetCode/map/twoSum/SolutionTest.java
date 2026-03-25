package leetCode.map.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = {2, 7, 11, 15};
        int[] output = {0, 1};
        assertArrayEquals(output, solution.twoSum(input, 9));
    }

    @Test
    void test2() {
        int[] input = {3, 2, 4};
        int[] output = {1, 2};
        assertArrayEquals(output, solution.twoSum(input, 6));
    }

    @Test
    void test3() {
        int[] input = {3, 3};
        int[] output = {0, 1};
        assertArrayEquals(output, solution.twoSum(input, 6));
    }
}