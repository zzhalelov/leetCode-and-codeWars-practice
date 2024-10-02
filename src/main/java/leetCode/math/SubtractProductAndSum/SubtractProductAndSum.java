package leetCode.math.SubtractProductAndSum;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        String string = String.valueOf(n);
        String[] stringArray = string.split("");
        int productOfDigits = 1;
        int sumOfDigits = 0;

        for (String s : stringArray) {
            productOfDigits *= Integer.parseInt(s);
            sumOfDigits += Integer.parseInt(s);
        }
        return productOfDigits - sumOfDigits;
    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
}