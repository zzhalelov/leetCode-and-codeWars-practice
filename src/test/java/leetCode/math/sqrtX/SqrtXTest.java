package leetCode.math.sqrtX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {
    @Test
    public void test1() {
        assertEquals(2, new SqrtX().mySqrt(4));
    }

    @Test
    public void test2() {
        assertEquals(2, new SqrtX().mySqrt(8));
    }
}