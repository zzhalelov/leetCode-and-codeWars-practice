package codeWars;

import java.util.ArrayList;
import java.util.Collections;

//Numbers that are a power of their sum of digits
//https://www.codewars.com/kata/55f4e56315a375c1ed000159/train/java
public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 200; j++) {
                long r = (long) Math.pow(i, j);
                if (sumDigits(r) == i)
                    a.add(r);
            }
        }
        Collections.sort(a);
        return a.get(n - 1);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(2));
    }
}