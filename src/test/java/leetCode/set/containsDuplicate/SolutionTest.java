package leetCode.set.containsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertTrue(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}