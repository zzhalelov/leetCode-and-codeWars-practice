package leetCode.map.maxFreqSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(6, solution.maxFreqSum("successes"));
    }

    @Test
    void test2() {
        assertEquals(3, solution.maxFreqSum("aeiaeia"));
    }
}