package leetCode.stack.backspaceStringCompare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2() {
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}