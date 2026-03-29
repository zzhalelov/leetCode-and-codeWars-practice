package leetCode.map.dayOfTheYear;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, isLeap ? 29 : 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);

        int result = 0;
        for (int i = 1; i < month; i++) {
            result += map.get(i);
        }

        return result + day;
    }
}