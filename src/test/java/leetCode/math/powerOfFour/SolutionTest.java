package leetCode.math.powerOfFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertTrue(Solution.isPowerOfFour(16));
    }

    @Test
    public void test2() {
        assertFalse(Solution.isPowerOfFour(17));
    }
}