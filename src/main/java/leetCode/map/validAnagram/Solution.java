package leetCode.map.validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * <a href="https://leetcode.com/problems/valid-anagram/submissions/1957813669/">Submission Link</a>
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer count = mapS.get(c);
            if (count == null) {
                mapS.put(c, 1);
            } else {
                mapS.put(c, count + 1);
            }
        }

        for (char ch : t.toCharArray()) {
            Integer count = mapT.get(ch);
            if (count == null) {
                mapT.put(ch, 1);
            } else {
                mapT.put(ch, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            if (!mapT.containsKey(entry.getKey()) || !mapT.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}