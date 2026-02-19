package leetCode.array.runningSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] arr = {1, 1, 1, 1, 1};
        int[] result = solution.runningSum(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4};
        int[] result = solution.runningSum(arr);
        assertArrayEquals(new int[]{1, 3, 6, 10}, result);
    }

    @Test
    public void test3() {
        int[] arr = {3, 1, 2, 10, 1};
        int[] result = solution.runningSum(arr);
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, result);
    }
}