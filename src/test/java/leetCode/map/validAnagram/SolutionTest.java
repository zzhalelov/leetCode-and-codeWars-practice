package leetCode.map.validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void test2() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void test3() {
        assertFalse(solution.isAnagram("ab", "a"));
    }

    @Test
    void test4() {
        assertFalse(solution.isAnagram("aacc", "ccac"));
    }

    @Test
    void test5() {
        assertFalse(solution.isAnagram("a", "ab"));
    }
}