package leetCode.stack.baseballGame;

import java.util.Stack;

/**
 * 682. Baseball Game<br>
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.<br>
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:<br>
 * Return the sum of all the scores on the record after applying all the operations.<br><br>
 * <a href="https://leetcode.com/problems/baseball-game/submissions/1924547974/">Submission link</a>
 */
public class Solution {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String s : operations) {
            switch (s) {
                case "C" -> sum -= stack.pop();
                case "D" -> {
                    int temp = stack.peek();
                    sum += stack.push(temp * 2);
                }
                case "+" -> {
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    stack.push(temp1);
                    sum += stack.push(temp1 + temp2);
                }
                default -> {
                    stack.push(Integer.parseInt(s));
                    sum += Integer.parseInt(s);
                }
            }
        }
        return sum;
    }
}