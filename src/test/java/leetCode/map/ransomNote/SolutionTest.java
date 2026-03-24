package leetCode.map.ransomNote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertFalse(solution.canConstruct("a", "b"));
    }

    @Test
    void test2() {
        assertFalse(solution.canConstruct("aa", "ab"));
    }

    @Test
    void test3() {
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}