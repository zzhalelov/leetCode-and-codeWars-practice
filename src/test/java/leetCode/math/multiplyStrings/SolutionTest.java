package leetCode.math.multiplyStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        assertEquals("6", Solution.multiply("2", "3"));
    }

    @Test
    public void test2() {
        assertEquals("56088", Solution.multiply("123", "456"));
    }
    @Test
    public void test3() {
        assertEquals("121932631112635269", Solution.multiply("123456789", "987654321"));
    }
}