package leetCode.array.alternatingSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(-4, solution.alternatingSum(new int[]{1, 3, 5, 7}));
    }

    @Test
    void test2() {
        assertEquals(100, solution.alternatingSum(new int[]{100}));
    }
}