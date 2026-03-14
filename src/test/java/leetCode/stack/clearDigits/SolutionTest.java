package leetCode.stack.clearDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "abc";
        assertEquals("abc", solution.clearDigits(s));
    }

    @Test
    public void test2() {
        String s = "cb34";
        assertEquals("", solution.clearDigits(s));
    }
}