package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdAngleTest {
    @Test
    public void test1() {
        assertEquals(123, ThirdAngle.otherAngle(45, 12));
    }

    @Test
    public void test2() {
        assertEquals(70, ThirdAngle.otherAngle(50, 60));
    }
}