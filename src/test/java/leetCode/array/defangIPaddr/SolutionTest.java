package leetCode.array.defangIPaddr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
    }

    @Test
    void test2() {
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
    }
}