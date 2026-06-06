package leetCode.array.isPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void test2() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void test3() {
        assertTrue(solution.isPalindrome(" "));
    }

    @Test
    void test4() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void test5() {
        assertFalse(solution.isPalindrome("ab"));
    }

    @Test
    void test6() {
        assertTrue(solution.isPalindrome("aa"));
    }

    @Test
    void test7() {
        assertTrue(solution.isPalindrome("     "));
    }

    @Test
    void test8() {
        assertTrue(solution.isPalindrome("AbBa"));
    }

    @Test
    void test9() {
        assertFalse(solution.isPalindrome("123421"));
    }

    @Test
    void test10() {
        assertFalse(solution.isPalindrome("0P"));
    }

    @Test
    void test11() {
        assertTrue(solution.isPalindrome("a_b_a"));
    }

    @Test
    void test12() {
        assertTrue(solution.isPalindrome("tab: bat"));
    }

    @Test
    void test13() {
        assertFalse(solution.isPalindrome("1a2"));
    }

    @Test
    void test14() {
        assertTrue(solution.isPalindrome("aba"));
    }

    @Test
    void test15() {
        assertTrue(solution.isPalindrome("abba"));
    }
}