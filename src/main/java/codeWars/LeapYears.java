package codeWars;

import java.time.LocalDate;

public class LeapYears {
    public static boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        boolean isLeap = date.isLeapYear();
        return isLeap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
