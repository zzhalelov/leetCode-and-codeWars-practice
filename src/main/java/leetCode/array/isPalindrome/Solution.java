package leetCode.array.isPalindrome;

//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/submissions/2024697927/
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}