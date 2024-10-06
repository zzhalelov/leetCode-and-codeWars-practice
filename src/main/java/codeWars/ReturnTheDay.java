package codeWars;

public class ReturnTheDay {
    public static String getDay(int n) {
        String dayOfWeek;
        switch (n) {
            case 1 -> dayOfWeek = "Sunday";
            case 2 -> dayOfWeek = "Monday";
            case 3 -> dayOfWeek = "Tuesday";
            case 4 -> dayOfWeek = "Wednesday";
            case 5 -> dayOfWeek = "Thursday";
            case 6 -> dayOfWeek = "Friday";
            case 7 -> dayOfWeek = "Saturday";
            default -> dayOfWeek = "Wrong, please enter a number between 1 and 7";
        }
        return dayOfWeek;
    }
}