package leetCode.math.addToArrayInteger;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> resultNumbers = new ArrayList<>();
        int carry = k;
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            resultNumbers.add(0, sum % 10);
            carry = sum / 10;
        }
        while (carry > 0) {
            resultNumbers.add(0, carry % 10);
            carry /= 10;
        }
        return resultNumbers;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }
}