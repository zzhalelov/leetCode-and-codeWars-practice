package leetCode.map.findAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//890. Find and Replace Pattern
//https://leetcode.com/problems/find-and-replace-pattern/submissions/2014606636/
public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        Map<Character, Character> patternToWord = new HashMap<>();
        Map<Character, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p_ch = pattern.charAt(i);
            char w_ch = word.charAt(i);

            if (patternToWord.containsKey(p_ch)) {
                if (patternToWord.get(p_ch) != w_ch) {
                    return false;
                }
            } else {
                patternToWord.put(p_ch, w_ch);
            }

            if (wordToPattern.containsKey(w_ch)) {
                if (wordToPattern.get(w_ch) != p_ch) {
                    return false;
                }
            } else {
                wordToPattern.put(w_ch, p_ch);
            }
        }

        return true;
    }
}