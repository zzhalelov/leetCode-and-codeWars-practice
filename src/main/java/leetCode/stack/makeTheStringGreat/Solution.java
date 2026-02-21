package leetCode.stack.makeTheStringGreat;

import java.util.Stack;

/**
 * 1544. Make The String Great
 * <p>
 * Given a string s of lower and upper case English letters.
 * <p>
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * <p>
 * <a href="https://leetcode.com/problems/make-the-string-great/submissions/1926694418/">Submission link</a>
 */
public class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch)
                    && ((Character.isLowerCase(stack.peek()) && Character.isUpperCase(ch))
                    || (Character.isUpperCase(stack.peek()) && Character.isLowerCase(ch)))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}