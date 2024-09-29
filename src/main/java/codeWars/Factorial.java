package codeWars;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("IllegalArgumentException");
        } else {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
