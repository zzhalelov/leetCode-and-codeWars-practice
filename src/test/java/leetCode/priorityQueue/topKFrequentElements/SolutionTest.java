package leetCode.priorityQueue.topKFrequentElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] input = {1, 1, 1, 2, 2, 3};
        int[] output = {1, 2};
        assertArrayEquals(output, solution.topKFrequent(input, 2));
    }

    @Test
    void test2() {
        int[] input = {1};
        int[] output = {1};
        assertArrayEquals(output, solution.topKFrequent(input, 1));
    }

    @Test
    void test3() {
        int[] input = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int[] output = {1, 2};
        assertArrayEquals(output, solution.topKFrequent(input, 2));
    }
}