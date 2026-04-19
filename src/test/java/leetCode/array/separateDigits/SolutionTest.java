package leetCode.array.separateDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 8, 3, 7, 7}, solution.separateDigits(new int[]{13, 25, 83, 77}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{7, 1, 3, 9}, solution.separateDigits(new int[]{7, 1, 3, 9}));
    }
}