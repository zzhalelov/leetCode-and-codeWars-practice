package leetCode.priorityQueue.relativeRanks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 506. Relative Ranks
 * <p>
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
 * All the scores are guaranteed to be unique.
 * <p>
 * Return an array answer of size n where answer[i] is the rank of the ith athlete.
 * <p>
 * <a href="https://leetcode.com/problems/relative-ranks/submissions/1962757443/">Submission Link</a>
 */
class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] score = {5, 4, 3, 2, 1};
        String[] result = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assertArrayEquals(result, solution.findRelativeRanks(score));
    }

    @Test
    void test2() {
        int[] score = {10, 3, 8, 9, 4};
        String[] result = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(result, solution.findRelativeRanks(score));
    }
}