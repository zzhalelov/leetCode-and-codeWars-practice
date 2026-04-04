package leetCode.priorityQueue.topKFrequentWords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals(List.of("i", "love"), solution.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }

    @Test
    void test2() {
        assertEquals(List.of("the", "is", "sunny", "day"), solution.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }
}