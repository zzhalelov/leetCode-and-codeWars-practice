package leetCode.map.isIsomorphic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    void test2() {
        assertFalse(solution.isIsomorphic("f11", "b23"));
    }

    @Test
    void test3() {
        assertTrue(solution.isIsomorphic("paper", "title"));
    }
}