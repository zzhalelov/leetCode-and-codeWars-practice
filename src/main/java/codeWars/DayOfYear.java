package codeWars;

import java.time.LocalDate;

public class DayOfYear {
    public static int toDayOfYear(int[] date) {
        //Happy Coding!
        LocalDate localDate = LocalDate.of(date[2], date[1], date[0]);
        int dayOfYear = localDate.getDayOfYear();

        return dayOfYear;
    }

    public static void main(String[] args) {
        int[] date = {25, 5, 2022};
        System.out.println(toDayOfYear(date));
    }
}
