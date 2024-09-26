package topic.math.addBinary;

public class AddBinary {
    public static String addBinary(String a, String b) {
        Integer firstNumber = Integer.parseInt(a, 2);
        Integer secondNumber = Integer.parseInt(b, 2);
        int resultInt = firstNumber + secondNumber;
        return Integer.toBinaryString(resultInt);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}