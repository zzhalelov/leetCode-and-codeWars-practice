package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnTheDayTest {
    @Test
    public void test1() {
        assertEquals("Sunday", ReturnTheDay.getDay(1));
    }

    @Test
    public void test2() {
        assertEquals("Friday", ReturnTheDay.getDay(6));
    }
}