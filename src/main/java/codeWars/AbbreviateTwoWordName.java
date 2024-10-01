package codeWars;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        String[] firstWord = split[0].split("");
        String[] secondWord = split[1].split("");

        return firstWord[0].toUpperCase() + "." + secondWord[0].toUpperCase();
    }

    public static void main(String[] args) {
        String name = "Michael Kors";
        System.out.println(abbrevName(name));
    }
}