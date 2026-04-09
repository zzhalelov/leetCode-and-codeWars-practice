package leetCode.math.mirrorDistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(27, solution.mirrorDistance(25));
    }

    @Test
    void test2() {
        assertEquals(9, solution.mirrorDistance(10));
    }

    @Test
    void test3() {
        assertEquals(0, solution.mirrorDistance(7));
    }

    @Test
    void test4() {
        assertEquals(9, solution.mirrorDistance(10));
    }
}