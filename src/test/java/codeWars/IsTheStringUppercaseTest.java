package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsTheStringUppercaseTest {
    @Test
    public void test1() {
        assertTrue(IsTheStringUppercase.isUpperCase("C"));
    }

    @Test
    public void test2() {
        assertFalse(IsTheStringUppercase.isUpperCase("c"));
    }

    @Test
    public void test3() {
        assertFalse(IsTheStringUppercase.isUpperCase("hello I AM DONALD"));
    }

    @Test
    public void test4() {
        assertFalse(IsTheStringUppercase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"));
    }

    @Test
    public void test5() {
        assertTrue(IsTheStringUppercase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"));
    }

    @Test
    public void test6() {
        assertTrue(IsTheStringUppercase.isUpperCase("HELLO I AM DONALD"));
    }
}