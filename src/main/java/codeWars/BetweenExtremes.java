package codeWars;

import java.util.Arrays;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
        // your code goes here
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 434, 555, 34, 112};
        System.out.println(betweenExtremes(numbers));
    }
}
