package leetCode.stack.backspaceStringCompare;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 * <p>
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 * <p>
 * <a href="https://leetcode.com/problems/backspace-string-compare/submissions/1923301757/">Submission link</a>
 */
public class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != '#') stack1.push(ch);
            else {
                if (!stack1.empty())
                    stack1.pop();
            }
        }

        Stack<Character> stack2 = new Stack<>();
        for (char ch : t.toCharArray()) {
            if (ch != '#') stack2.push(ch);
            else {
                if (!stack2.empty())
                    stack2.pop();
            }
        }
        return stack1.equals(stack2);
    }
}