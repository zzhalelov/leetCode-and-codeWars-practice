package leetCode.math.DayOfTheYear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheYearTest {
    @Test
    public void test1() {
        assertEquals(9, DayOfTheYear.dayOfYear("2019-01-09"));
    }

    @Test
    public void test2() {
        assertEquals(41, DayOfTheYear.dayOfYear("2019-02-10"));
    }
}