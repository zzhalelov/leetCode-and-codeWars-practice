package leetCode.map.maxFreqSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if (key.equals('a') || key.equals('e') || key.equals('i')
                    || key.equals('o') || key.equals('u')) {
                if (value > vowelCount) {
                    vowelCount = value;
                }
            } else {
                if (value > consonantCount) {
                    consonantCount = value;
                }
            }

        }
        return vowelCount + consonantCount;
    }
}