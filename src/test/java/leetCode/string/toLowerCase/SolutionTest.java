package leetCode.string.toLowerCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals("hello", solution.toLowerCase("Hello"));
    }

    @Test
    void test2() {
        assertEquals("here", solution.toLowerCase("here"));
    }

    @Test
    void test3() {
        assertEquals("lovely", solution.toLowerCase("LOVELY"));
    }
}