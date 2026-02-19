package leetCode.array.findPivotIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int res = solution.pivotIndex(arr);
        assertEquals(3, res);
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3};
        int res = solution.pivotIndex(arr);
        assertEquals(-1, res);
    }

    @Test
    public void test3() {
        int[] arr = {2, 1, -1};
        int res = solution.pivotIndex(arr);
        assertEquals(0, res);
    }
}