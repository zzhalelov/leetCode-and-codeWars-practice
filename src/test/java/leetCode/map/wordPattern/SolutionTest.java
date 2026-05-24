package leetCode.map.wordPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void test2() {
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void test3() {
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    }
}