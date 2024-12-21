package codeWars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        char[] characters = input.toCharArray();
        Character[] characterArray = new Character[characters.length];
        for (int i = 0; i < characters.length; i++) {
            characterArray[i] = characters[i];
            if (Character.isUpperCase(characterArray[i])){

            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}