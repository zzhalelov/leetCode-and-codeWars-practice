package leetCode.array.moveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {0, 1, 0, 3, 12};
        Solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test2() {
        int[] nums = {0};
        Solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }
}