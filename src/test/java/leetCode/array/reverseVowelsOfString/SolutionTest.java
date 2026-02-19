package leetCode.array.reverseVowelsOfString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals("AceCreIm", solution.reverseVowels("IceCreAm"));
    }

    @Test
    public void test2() {
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}