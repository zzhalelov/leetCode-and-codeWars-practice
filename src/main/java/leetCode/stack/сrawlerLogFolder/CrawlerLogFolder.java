package leetCode.stack.сrawlerLogFolder;

import java.util.Stack;

/**
 * 1598. Crawler Log Folder
 * The Leetcode file system keeps a log each time some user performs a change folder operation.
 * <p>
 * You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
 * <p>
 * The file system starts in the main folder, then the operations in logs are performed.
 * <p>
 * Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 * <br><br>
 * <a href="https://leetcode.com/problems/crawler-log-folder/submissions/1925528707/">Submission link</a>
 */
public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int count = 0;
        for (String log : logs) {
            if (log.isEmpty() || log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    count--;
                }
            } else {
                stack.push(log);
                count++;
            }
        }
        return count;
    }
}