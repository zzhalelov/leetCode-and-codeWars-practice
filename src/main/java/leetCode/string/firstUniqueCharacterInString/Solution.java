package leetCode.string.firstUniqueCharacterInString;

import java.util.HashMap;

//given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
public class Solution {
    public int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string to populate the character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }

        return -1; // If no non-repeating character is found, return -1
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Solution solution = new Solution();
        int result = solution.firstUniqChar(s);
        System.out.println("Index of the first non-repeating character: " + result);
    }
}