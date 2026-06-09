package leetCode.array.maxVowels;

//1456. Maximum Number of Vowels in a Substring of Given Length
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/2027855702/
public class Solution {
    public int maxVowels(String s, int k) {
        int currentCount = 0;
        int maxCount = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (chars[i] == 'a'
                    || chars[i] == 'e'
                    || chars[i] == 'i'
                    || chars[i] == 'o'
                    || chars[i] == 'u') {
                currentCount++;
            }
            maxCount = currentCount;
        }

        for (int right = k; right < chars.length; right++) {
            if (chars[right] == 'a'
                    || chars[right] == 'e'
                    || chars[right] == 'i'
                    || chars[right] == 'o'
                    || chars[right] == 'u') {
                currentCount++;
            }

            if (chars[right - k] == 'a'
                    || chars[right - k] == 'e'
                    || chars[right - k] == 'i'
                    || chars[right - k] == 'o'
                    || chars[right - k] == 'u') {
                currentCount--;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
}