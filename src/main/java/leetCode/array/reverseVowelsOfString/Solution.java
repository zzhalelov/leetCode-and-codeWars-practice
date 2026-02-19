package leetCode.array.reverseVowelsOfString;

/**
 * 345. Reverse Vowels of a String<br>
 * Given a string s, reverse only all the vowels in the string and return it.
 * <br>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * <br><br>
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1897618433/">Submission link</a>
 */
public class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}