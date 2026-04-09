package leetCode.array.checkBalancedString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertFalse(solution.isBalanced("1234"));
    }

    @Test
    void test2() {
        assertTrue(solution.isBalanced("24123"));
    }
}