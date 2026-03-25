package leetCode.map.maxNumberPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(2, solution.maxOperations(arr, 5));
    }

    @Test
    void test2() {
        int[] arr = {3, 1, 3, 4, 3};
        assertEquals(1, solution.maxOperations(arr, 6));
    }
}