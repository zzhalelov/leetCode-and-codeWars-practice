package codeWars;

import java.util.Arrays;

public class Count {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};  // Если массив пуст или равен null, вернуть пустой массив
        }
        int count = 0;
        int sum = 0;
        for (int num : input) {
            if (num > 0) {
                count++;
            }
            if (num < 0) {
                sum += num;
            }
        }
        int[] output = {count, sum};
        System.out.println(Arrays.toString(output));
        return output; //return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        int[] input = {0, 2, 3, 0, 5, 6, 7, 1, 9, 10, -11, -12, -13, -14};
        countPositivesSumNegatives(input);
    }
}
