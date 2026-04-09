package leetCode.math.calculateDelayedArrivalTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(20, solution.findDelayedArrivalTime(15, 5));
    }

    @Test
    void test2() {
        assertEquals(0, solution.findDelayedArrivalTime(13, 11));
    }
}