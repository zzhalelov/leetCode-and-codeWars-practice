package topic.math.addBinary;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String a, String b) {
        BigInteger firstNumber = new BigInteger(a, 2);
        BigInteger secondNumber = new BigInteger(b, 2);

        BigInteger result = firstNumber.add(secondNumber);

        return result.toString(2);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}