package leetCode.priorityQueue.largestNumberAfterDigitSwaps;

import java.util.PriorityQueue;

/**
 * 2231. Largest Number After Digit Swaps by Parity
 * <p>
 * You are given a positive integer num.
 * You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).
 * <p>
 * Return the largest possible value of num after any number of swaps.
 * <p>
 * <a href="https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/submissions/1962866598/">Submission Link</a>
 */
public class Solution {
    public int largestInteger(int num) {
        String s = String.valueOf(num);
        char[] digits = s.toCharArray();

        PriorityQueue<Integer> evens = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> odds = new PriorityQueue<>((a, b) -> b - a);

        for (char d : digits) {
            int val = d - '0';
            if (val % 2 == 0) evens.add(val);
            else odds.add(val);
        }

        StringBuilder sb = new StringBuilder();
        for (char d : digits) {
            int val = d - '0';
            if (val % 2 == 0) {
                sb.append(evens.poll());
            } else {
                sb.append(odds.poll());
            }
        }

        return Integer.parseInt(sb.toString());
    }
}