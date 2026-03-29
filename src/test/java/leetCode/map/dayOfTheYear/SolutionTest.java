package leetCode.map.dayOfTheYear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(9, solution.dayOfYear("2019-01-09"));
    }

    @Test
    void test2() {
        assertEquals(41, solution.dayOfYear("2019-02-10"));
    }

    @Test
    void test3() {
        assertEquals(274, solution.dayOfYear("2019-10-01"));
    }

    @Test
    void test4() {
        assertEquals(15, solution.dayOfYear("2020-01-15"));
    }

    @Test
    void test5() {
        assertEquals(61, solution.dayOfYear("2020-03-01"));
    }

    @Test
    void test6() {
        assertEquals(85, solution.dayOfYear("2026-03-26"));
    }

    @Test
    void test7() {
        assertEquals(40, solution.dayOfYear("2016-02-09"));
    }

    @Test
    void test8() {
        assertEquals(60, solution.dayOfYear("2016-02-29"));
    }

    @Test
    void test9() {
        assertEquals(85, solution.dayOfYear("2016-03-25"));
    }

    @Test
    void test10() {
        assertEquals(122, solution.dayOfYear("1900-05-02"));
    }

    @Test
    void test11() {
        assertEquals(284, solution.dayOfYear("2008-10-10"));
    }
}