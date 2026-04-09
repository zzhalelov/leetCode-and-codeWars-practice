package leetCode.math.addTwoIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(17, solution.sum(12, 5));
    }


    @Test
    void test2() {
        assertEquals(-6, solution.sum(-10, 4));
    }
}