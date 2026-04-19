package leetCode.array.canPlaceFlowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 0}, 1));
    }

    @Test
    void test2() {
        assertFalse(solution.canPlaceFlowers(new int[]{0, 1, 0}, 1));
    }

    @Test
    void test3() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0}, 1));
    }

    @Test
    void test4() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    void test5() {
        assertFalse(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    void test6() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
    }

    @Test
    void test7() {
        assertFalse(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }

    @Test
    void test8() {
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 1}, 1));
    }

    @Test
    void test9() {
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 0, 1, 0, 0}, 2));
    }

    @Test
    void test10() {
        assertTrue(solution.canPlaceFlowers(new int[]{0}, 1));
    }

    @Test
    void test11() {
        assertFalse(solution.canPlaceFlowers(new int[]{1}, 1));
    }

    @Test
    void test12() {
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0}, 1));
    }

    @Test
    void test13() {
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 3));
    }

    @Test
    void test14() {
        assertFalse(solution.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 4));
    }

    @Test
    void test15() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 1, 1}, 0));
    }
}