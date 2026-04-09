package leetCode.stack.reversePrefix;

import leetCode.stack.reversePrefix.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals("bacd", solution.reversePrefix("abcd", 2));
    }

    @Test
    void test2() {
        assertEquals("zyx", solution.reversePrefix("xyz", 3));
    }

    @Test
    void test3() {
        assertEquals("hey", solution.reversePrefix("hey", 1));
    }
}