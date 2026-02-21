package leetCode.stack.removeOutermostParentheses;

import java.util.Stack;

/**
 * 1021. Remove Outermost Parentheses
 * <p>
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings,
 * and + represents string concatenation.
 * <p>
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 * <p>
 * <a href=" * https://leetcode.com/problems/remove-outermost-parentheses/submissions/1926606136/">Submission link</a>
 */
public class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    sb.append(c);
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}