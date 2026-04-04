package leetCode.array.numberSegmentsInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(5, solution.countSegments("Hello, my name is John"));
    }

    @Test
    void test2() {
        assertEquals(1, solution.countSegments("Hello     "));
    }

    @Test
    void test3() {
        assertEquals(0, solution.countSegments(""));
    }

    @Test
    void test4() {
        assertEquals(0, solution.countSegments(" "));
    }

    @Test
    void test5() {
        assertEquals(0, solution.countSegments("                "));
    }
}