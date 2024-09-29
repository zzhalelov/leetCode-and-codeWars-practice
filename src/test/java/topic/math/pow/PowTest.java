package topic.math.pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowTest {
    @Test
    public void test1() {
        assertEquals(1024.0, Pow.myPow(2, 10));
    }
}