package leetCode.recursion.powXN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(1024, solution.myPow(2, 10));
    }

    @Test
    void test2() {
        assertEquals(0.25000, solution.myPow(2.00000, -2));
    }
}