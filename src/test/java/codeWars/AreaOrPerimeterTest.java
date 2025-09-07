package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOrPerimeterTest {
    @Test
    public void test1() {
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(3, 5));
    }

    @Test
    public void test2() {
        assertEquals(9, AreaOrPerimeter.areaOrPerimeter(3, 3));
    }
}