package leetCode.array.checkBalancedString;

public class Solution {
    public boolean isBalanced(String num) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                oddSum += Character.getNumericValue(num.charAt(i));
            } else {
                evenSum += Character.getNumericValue(num.charAt(i));
            }
        }
        return evenSum == oddSum;
    }
}