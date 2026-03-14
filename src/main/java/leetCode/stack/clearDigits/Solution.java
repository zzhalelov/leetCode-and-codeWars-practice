package leetCode.stack.clearDigits;

import java.util.Stack;

/**
 * 3174. Clear Digits
 * <p>
 * You are given a string s.
 * <p>
 * Your task is to remove all digits by doing this operation repeatedly:
 * <p>
 * Delete the first digit and the closest non-digit character to its left.
 * Return the resulting string after removing all digits.
 * </p>
 * <a href="https://leetcode.com/problems/clear-digits/submissions/1926771350/?envType=problem-list-v2&envId=stack">Submission link</a>
 */
public class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push(ch);
                sb.append(ch);
            } else if (!stack.isEmpty() && Character.isDigit(ch)) {
                stack.pop();
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}