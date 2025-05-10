package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringsTest {
    @Test
    public void test1() {
        assertArrayEquals(new String[]{"ab", "c_"}, SplitStrings.solution("abc"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, SplitStrings.solution("abcdef"));
    }
}