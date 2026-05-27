package leetCode.map.findAndReplacePattern;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        String[] words = {"a", "b", "c"};
        String pattern = "a";
        List<String> res = List.of("a", "b", "c");

        assertEquals(res, solution.findAndReplacePattern(words, pattern));
    }

    @Test
    void test2() {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> res = List.of("mee", "aqq");

        assertEquals(res, solution.findAndReplacePattern(words, pattern));
    }
}