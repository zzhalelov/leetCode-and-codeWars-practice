package codeWars;

import java.util.Arrays;

public class OrderingTheWords {
    public static String orderWord(String s) {
        if (s == null || s.length() == 0) {
            return "Invalid String!";
        }
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(orderWord(" hello"));
    }
}