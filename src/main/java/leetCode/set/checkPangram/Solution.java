package leetCode.set.checkPangram;

import java.util.HashSet;
import java.util.Set;

/**
 * 1832. Check if the Sentence Is Pangram
 * <p>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 * <p>
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/1937594302/">Submission link</a>
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }

        return set.size() == 26;
    }
}