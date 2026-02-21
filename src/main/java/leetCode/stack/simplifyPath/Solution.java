package leetCode.stack.simplifyPath;

import java.util.Stack;

/**
 * 71. Simplify Path
 * <p>
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'.
 * Your task is to transform this absolute path into its simplified canonical path.
 * <p>
 * <a href="https://leetcode.com/problems/simplify-path/submissions/1926714855/">Submission link</a>
 */
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String part : path.split("/")) {
            if (part.equals(".") || part.isEmpty()) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(part);
            }
        }
        return "/" + String.join("/", stack);
    }
}