package leetCode.map.firstUniqueCharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * </p>
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/submissions/1947814992/">Submission link</a>
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}