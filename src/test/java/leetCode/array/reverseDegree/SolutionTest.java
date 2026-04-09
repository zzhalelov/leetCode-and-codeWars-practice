package leetCode.array.reverseDegree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(148, solution.reverseDegree("abc"));
    }

    @Test
    void test2() {
        assertEquals(160, solution.reverseDegree("zaza"));
    }
}