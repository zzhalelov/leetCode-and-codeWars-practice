package leetCode.stack.minStack;

import java.util.Stack;

/**
 * 155. Min Stack
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * You must implement a solution with O(1) time complexity for each function.
 *
 * <a href="https://leetcode.com/problems/min-stack/submissions/1926751942/">Submission link</a>
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}