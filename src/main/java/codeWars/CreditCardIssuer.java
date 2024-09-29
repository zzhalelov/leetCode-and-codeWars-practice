package codeWars;

public class CreditCardIssuer {
    public static String getIssuer(String cardNumber) {
        // Your code here!
        if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"))) {
            return "AMEX";
        } else if (cardNumber.length() == 16 && (cardNumber.startsWith("6011"))) {
            return "Discover";
        } else if (cardNumber.length() == 16 && (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55"))) {
            return "Mastercard";
        } else if ((cardNumber.length() == 13 || cardNumber.length() == 16) && (cardNumber.startsWith("4"))) {
            return "VISA";
        } else {
            return "Unknown";
        }
    }

    public static void main(String[] args) {
        System.out.println(getIssuer("4111111111111111"));
    }
}
