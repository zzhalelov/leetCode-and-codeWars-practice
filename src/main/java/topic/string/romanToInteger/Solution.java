package topic.string.romanToInteger;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Create a mapping of Roman numeral characters to their integer values.
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        // Iterate through the Roman numeral string from right to left.
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToInt.get(s.charAt(i));
            // If the current value is less than the previous value, subtract it.
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution converter = new Solution();
        String romanNumeral = "MMXXIII"; // Example Roman numeral
        int intValue = converter.romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + intValue);
    }
}