package leetCode.math.mirrorDistance;

import java.util.Stack;

public class Solution {
    public int mirrorDistance(int n) {
        if (n < 10) {
            return 0;
        }
        if (n == 10) {
            return 9;
        }
        String nString = Integer.toString(n);

        Stack<Character> stack = new Stack<>();
        for (char ch : nString.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nString.length(); i++) {
            sb.append(stack.pop());
        }
        return Math.abs(n - Integer.parseInt(sb.toString()));
    }
}