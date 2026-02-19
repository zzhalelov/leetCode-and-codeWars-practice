package leetCode.stack.baseballGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        String[] strings = {"5", "2", "C", "D", "+"};
        assertEquals(30, Solution.calPoints(strings));
    }

    @Test
    public void test2() {
        String[] strings = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, Solution.calPoints(strings));
    }

    @Test
    public void test3() {
        String[] strings = {"1", "C"};
        assertEquals(0, Solution.calPoints(strings));
    }
}