package leetCode.math.multiplyStrings;

import java.math.BigInteger;

public class Solution {
    public static String multiply(String num1, String num2) {
        long number1 = Long.parseLong(num1);
        long number2 = Long.parseLong(num2);

        BigInteger result = BigInteger.valueOf(number1 * number2);
        return String.valueOf(result);
    }
}