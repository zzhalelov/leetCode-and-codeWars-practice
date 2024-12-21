package leetCode.validPerfectSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertTrue(Solution.isPerfectSquare(16));
    }

    @Test
    public void test2() {
        assertFalse(Solution.isPerfectSquare(14));
    }
}