package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {
    @Test
    public void test1() {
        assertEquals("Welcome", Welcome.greet("english"));
    }

    @Test
    public void test2() {
        assertEquals("Bienvenue", Welcome.greet("french"));
    }

    @Test
    public void test3() {
        assertEquals("Bienvenido", Welcome.greet("spanish"));
    }
}