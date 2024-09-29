package codeWars;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        // your code
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        int[] array = new int[0];
        System.out.println(oddOrEven(array));
    }
}
