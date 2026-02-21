package leetCode.stack.validParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void test3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }

    @Test
    public void test4() {
        String s = "([])";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void test5() {
        String s = "([)]";
        assertFalse(solution.isValid(s));
    }
}