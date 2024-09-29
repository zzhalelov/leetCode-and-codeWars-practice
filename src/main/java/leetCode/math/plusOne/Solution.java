package leetCode.math.plusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder builder = new StringBuilder();
        String string = null;
        for (int element : digits) {
            builder.append(element).append(", ");
            builder.delete(builder.length() - 2, builder.length()); // Удаляем последнюю запятую и пробел
            string = builder.toString();
        }
        assert string != null;
        Integer integer = Integer.parseInt(string);
        Integer newInteger = integer + 1;
        String newString = Integer.toString(newInteger);
        char[] charArray = newString.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        Solution solution = new Solution();
        solution.plusOne(digits);
    }
}