package leetCode.set.jewelsAndStones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
    }
}