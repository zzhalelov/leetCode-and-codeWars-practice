package leetCode.map.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

//205. Isomorphic Strings
//https://leetcode.com/problems/isomorphic-strings/submissions/2014540457/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length == tArr.length) {
            for (int i = 0; i < sArr.length; i++) {
                char s_ch = sArr[i];
                char t_ch = tArr[i];

                if (sMap.containsKey(s_ch)) {
                    if (!sMap.get(s_ch).equals(t_ch)) {
                        return false;
                    }
                } else {
                    sMap.put(s_ch, t_ch);
                }

                if (tMap.containsKey(t_ch)) {
                    if (tMap.get(t_ch) != s_ch) {
                        return false;
                    }
                } else {
                    tMap.put(t_ch, s_ch);
                }
            }
        } else {
            return false;
        }
        return true;
    }
}