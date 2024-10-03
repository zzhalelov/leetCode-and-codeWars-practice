package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeUpperCaseTest {
    @Test
    public void test() {
        assertEquals("HELLO WORLD", MakeUpperCase.MakeUpperCase("Hello World"));
    }
}