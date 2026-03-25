package leetCode.map.uniqueNumberOccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    void test2() {
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    void test3() {
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}