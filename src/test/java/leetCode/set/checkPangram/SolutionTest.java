package leetCode.set.checkPangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    public void test2() {
        assertFalse(solution.checkIfPangram("leetcode"));
    }
}