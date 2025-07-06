package codeWars;

//Digital root is the recursive sum of all the digits in a number.
//Given n, take the sum of the digits of n. If that value has more than one digit,
// continue reducing in this way until a single-digit number is produced.
// The input will be a non-negative integer.
//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
public class SumOfDigits {
    public static int digital_root(int n) {
        if (String.valueOf(n).length() > 1) {
            int digitSum = 0;
            String numAsString = String.valueOf(n);

            for (int i = 0; i < numAsString.length(); i++) {
                int digit = Character.getNumericValue(numAsString.charAt(i));
                digitSum += digit;
            }
            return digital_root(digitSum);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }
}