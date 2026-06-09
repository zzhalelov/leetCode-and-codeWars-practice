package leetCode.array.maxVowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(3, solution.maxVowels("abciiidef", 3));
    }

    @Test
    void test2() {
        assertEquals(2, solution.maxVowels("aeiou", 2));
    }

    @Test
    void test3() {
        assertEquals(2, solution.maxVowels("leetcode", 3));
    }
}