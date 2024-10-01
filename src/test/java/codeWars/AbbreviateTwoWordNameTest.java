package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviateTwoWordNameTest {
    @Test
    public void test1() {
        assertEquals("M.K", AbbreviateTwoWordName.abbrevName("Michael Kors"));
    }

    @Test
    public void test2() {
        assertEquals("H.P", AbbreviateTwoWordName.abbrevName("Hewlett Packard"));
    }
}