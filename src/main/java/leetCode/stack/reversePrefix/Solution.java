package leetCode.stack.reversePrefix;

import java.util.Stack;

public class Solution {
    public String reversePrefix(String s, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                sb.append(stack.pop());
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}