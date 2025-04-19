package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPhoneNumberTest {
    @Test
    void test1() {
        assertTrue(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
    }

    @Test
    void test2() {
        assertFalse(ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
    }

    @Test
    void test3() {
        assertFalse(ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
    }
}