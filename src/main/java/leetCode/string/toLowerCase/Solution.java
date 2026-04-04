package leetCode.string.toLowerCase;

/**
 * 709. To Lower Case
 * <p>
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter
 * <p>
 * <a href="https://leetcode.com/problems/to-lower-case/submissions/1965245222/">Submission Link</a>
 */
public class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}