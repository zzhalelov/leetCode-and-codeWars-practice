package leetCode.stack.removeOutermostParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "(()())(())";
        assertEquals("()()()", solution.removeOuterParentheses(s));
    }

    @Test
    public void test2() {
        String s = "(()())(())(()(()))";
        assertEquals("()()()()(())", solution.removeOuterParentheses(s));
    }

    @Test
    public void test3() {
        String s = "()()";
        assertEquals("", solution.removeOuterParentheses(s));
    }
}