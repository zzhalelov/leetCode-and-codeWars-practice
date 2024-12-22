package leetCode.math.daysBetweenDates;

import java.time.Duration;
import java.time.LocalDate;

public class Solution {
    public static int daysBetweenDates(String date1, String date2) {
        String[] splitDate1 = date1.split("-");
        LocalDate localDate1 = LocalDate.of(
                Integer.parseInt(splitDate1[0]),
                Integer.parseInt(splitDate1[1]),
                Integer.parseInt(splitDate1[2]));

        String[] splitDate2 = date2.split("-");
        LocalDate localDate2 = LocalDate.of(
                Integer.parseInt(splitDate2[0]),
                Integer.parseInt(splitDate2[1]),
                Integer.parseInt(splitDate2[2]));

        return Math.abs((int) Duration.between(
                localDate1.atStartOfDay(),
                localDate2.atStartOfDay()).toDays());
    }

    public static void main(String[] args) {
        String date1 = "1971-06-29";
        String date2 = "2010-09-23";
        System.out.println(daysBetweenDates(date1, date2));
    }
}