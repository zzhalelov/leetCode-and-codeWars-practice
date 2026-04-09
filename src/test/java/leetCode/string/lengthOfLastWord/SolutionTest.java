package leetCode.string.lengthOfLastWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void test2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void test3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}