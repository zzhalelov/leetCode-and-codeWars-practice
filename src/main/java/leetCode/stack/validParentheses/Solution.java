package leetCode.stack.validParentheses;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * </p>
 * <a href="https://leetcode.com/problems/valid-parentheses/submissions/1921923065/">Submission link</a>
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.empty() || stack.pop() != ch) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}