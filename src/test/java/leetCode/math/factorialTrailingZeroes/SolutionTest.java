package leetCode.math.factorialTrailingZeroes;

import codeWars.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertEquals(0, Solution.trailingZeroes(3));
    }

    @Test
    public void test2() {
        assertEquals(1, Solution.trailingZeroes(5));
    }

    @Test
    public void test3() {
        assertEquals(0, Solution.trailingZeroes(0));
    }
}