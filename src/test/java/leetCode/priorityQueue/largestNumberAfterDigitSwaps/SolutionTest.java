package leetCode.priorityQueue.largestNumberAfterDigitSwaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(3412, solution.largestInteger(1234));
    }

    @Test
    void test2() {
        assertEquals(87655, solution.largestInteger(65875));
    }
}