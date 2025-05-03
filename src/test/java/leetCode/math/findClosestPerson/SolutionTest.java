package leetCode.math.findClosestPerson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertEquals(1, Solution.findClosest(2, 7, 4));
    }

    @Test
    public void test2() {
        assertEquals(2, Solution.findClosest(2, 5, 6));
    }

    @Test
    public void test3() {
        assertEquals(0, Solution.findClosest(1, 5, 3));
    }
}