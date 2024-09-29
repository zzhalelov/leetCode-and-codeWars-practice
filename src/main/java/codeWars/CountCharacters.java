package codeWars;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> countMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            countMap.put(chars[i], 1);
        }
        System.out.println(countMap);
        return countMap;
    }

    public static void main(String[] args) {
        String str = "aba";
        count(str);
    }
}