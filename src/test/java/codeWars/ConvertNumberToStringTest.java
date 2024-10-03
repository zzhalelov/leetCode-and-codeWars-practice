package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberToStringTest {
    @Test
    public void test() {
        assertEquals("999", ConvertNumberToString.numberToString(999));
    }
}