package leetCode.stack.removeAllDuplicates;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 * <p>
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 * <p>
 * We repeatedly make duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 * <p>
 * <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/1926648896/">Submission link</a>
 */
public class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}