package leetCode.array.numberOfEmployeesWhoMetTarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(3, solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
    }

    @Test
    void test2() {
        assertEquals(0, solution.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6));
    }
}