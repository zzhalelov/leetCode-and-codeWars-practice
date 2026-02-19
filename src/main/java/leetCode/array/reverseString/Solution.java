package leetCode.array.reverseString;

/**
 * Write a function that reverses a string. The input string is given as an array of characters<br><br>
 * <a href="https://leetcode.com/problems/reverse-string/submissions/1897561357/">Submission link</a>
 */

public class Solution {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}