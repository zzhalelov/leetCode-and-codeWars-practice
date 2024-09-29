package codeWars;

public class NthPower {
    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i], power) - array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int power = 3;
        System.out.println(modifiedSum(array, power));
    }
}
