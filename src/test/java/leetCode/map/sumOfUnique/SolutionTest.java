package leetCode.map.sumOfUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(4, solution.sumOfUnique(new int[]{1, 2, 3, 2}));
    }

    @Test
    void test2() {
        assertEquals(0, solution.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void test3() {
        assertEquals(15, solution.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}