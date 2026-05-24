package leetCode.map.wordPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//290. Word Pattern
//https://leetcode.com/problems/word-pattern/submissions/2011886772/
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        char[] p = pattern.toCharArray();
        System.out.println(Arrays.toString(p));
        String[] strs = s.split(" ");

        if (p.length == strs.length) {
            for (int i = 0; i < p.length; i++) {
                char ch = p[i];
                String word = strs[i];

                if (charToWord.containsKey(ch)) {
                    if (!charToWord.get(ch).equals(word)) {
                        return false;
                    }
                } else {
                    charToWord.put(ch, word);
                }

                if (wordToChar.containsKey(word)) {
                    if (wordToChar.get(word) != ch) {
                        return false;
                    }
                } else {
                    wordToChar.put(word, ch);
                }
            }
        } else {
            return false;
        }
        return true;
    }
}