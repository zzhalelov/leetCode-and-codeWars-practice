package leetCode.array.reverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test1() {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        Solution.reverseString(arr);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, arr);
    }

    @Test
    public void test2() {
        char[] arr = {'H', 'a', 'n', 'n', 'a', 'h'};
        Solution.reverseString(arr);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, arr);
    }
}