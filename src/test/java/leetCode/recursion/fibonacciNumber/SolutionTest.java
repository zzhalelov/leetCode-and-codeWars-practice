package leetCode.recursion.fibonacciNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void test2() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    void test3() {
        assertEquals(3, solution.fib(4));
    }
}