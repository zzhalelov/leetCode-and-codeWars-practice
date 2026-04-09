package leetCode.array.concatenationOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = {1, 2, 1};
        int[] output = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(output, solution.getConcatenation(input));
    }

    @Test
    void test2() {
        int[] input = {1, 3, 2, 1};
        int[] output = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(output, solution.getConcatenation(input));
    }
}