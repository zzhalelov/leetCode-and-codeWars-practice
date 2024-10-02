package leetCode.math.DayOfTheYear;

import java.time.LocalDate;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
        String[] dateStr = date.split("-");
        LocalDate localDate = LocalDate.of(
                Integer.parseInt(dateStr[0]),
                Integer.parseInt(dateStr[1]),
                Integer.parseInt(dateStr[2]));

        return localDate.getDayOfYear();
    }

    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(dayOfYear(date));
    }
}