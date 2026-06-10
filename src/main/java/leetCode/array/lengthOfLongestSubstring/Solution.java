package leetCode.array.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/2028941898/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {
            map.put(chars[right], map.getOrDefault(chars[right], 0) + 1);

            while (map.get(chars[right]) > 1) {
                map.put(chars[left], map.get(chars[left]) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}