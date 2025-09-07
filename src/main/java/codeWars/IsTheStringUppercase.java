package codeWars;

public class IsTheStringUppercase {
    public static boolean isUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}