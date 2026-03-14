package leetCode.set.jewelsAndStones;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. Jewels and Stones
 * <p>
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * <a href="https://leetcode.com/problems/jewels-and-stones/submissions/1937568511/">Submission link</a>
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int num = 0;

        for (char j : jewels.toCharArray()) {
            set.add(j);
        }

        for (char s : stones.toCharArray()) {
            if (set.contains(s)) {
                num++;
            }
        }
        return num;
    }
}