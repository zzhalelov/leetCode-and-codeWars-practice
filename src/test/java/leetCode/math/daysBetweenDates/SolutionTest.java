package leetCode.math.daysBetweenDates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertEquals(1, Solution.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test2() {
        assertEquals(15, Solution.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    @Test
    public void test3() {
        assertEquals(14331, Solution.daysBetweenDates("1971-06-29", "2010-09-23"));
    }
}