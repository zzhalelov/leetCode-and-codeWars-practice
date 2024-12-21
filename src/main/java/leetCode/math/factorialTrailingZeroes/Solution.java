package leetCode.math.factorialTrailingZeroes;

public class Solution {
    public static int trailingZeroes(int n) {
        int c = 0;
        while (n != 0) {
            n /= 5;
            c += n;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(7));
    }
}