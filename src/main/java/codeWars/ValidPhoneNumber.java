package codeWars;

//https://www.codewars.com/kata/525f47c79f2f25a4db000025/java
//Write a function that accepts a string, and returns true if it is in the form of a phone number.
//Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
//Only worry about the following format:
//(123) 456-7890 (don't forget the space after the close parentheses)

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        // TODO: Return whether phoneNumber is in the proper form
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

    public static void main(String[] args) {
        String s = "(123) 456-7890";
        System.out.println(validPhoneNumber(s));
    }
}