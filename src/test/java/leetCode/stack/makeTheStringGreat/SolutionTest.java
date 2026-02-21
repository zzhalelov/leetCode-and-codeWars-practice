package leetCode.stack.makeTheStringGreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "leEeetcode";
        assertEquals("leetcode", solution.makeGood(s));
    }

    @Test
    public void test2() {
        String s = "abBAcC";
        assertEquals("", solution.makeGood(s));
    }

    @Test
    public void test3() {
        String s = "s";
        assertEquals("s", solution.makeGood(s));
    }
}