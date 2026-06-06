package leetCode.array.sortColors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = {2, 0, 2, 1, 1, 0};
        int[] expectedOutput = {0, 0, 1, 1, 2, 2};
        solution.sortColors(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    void test2() {
        int[] input = {2, 0, 1};
        int[] expectedOutput = {0, 1, 2};
        solution.sortColors(input);
        assertArrayEquals(expectedOutput, input);
    }
}