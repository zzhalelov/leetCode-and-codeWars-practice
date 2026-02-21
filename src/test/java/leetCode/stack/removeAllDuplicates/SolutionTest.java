package leetCode.stack.removeAllDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "abbaca";
        assertEquals("ca", solution.removeDuplicates(s));
    }

    @Test
    public void test2() {
        String s = "azxxzy";
        assertEquals("ay", solution.removeDuplicates(s));
    }
}