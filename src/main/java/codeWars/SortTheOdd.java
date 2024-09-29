package codeWars;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                i = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 6, 3, 4};

    }
}