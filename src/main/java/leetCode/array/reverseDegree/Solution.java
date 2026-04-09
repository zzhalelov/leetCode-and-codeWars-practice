package leetCode.array.reverseDegree;

public class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int alphabetIndex = currentChar - 'a';
            int reversedAlphabetValue = 26 - alphabetIndex;
            int stringPosition = i + 1;
            sum += reversedAlphabetValue * stringPosition;
        }
        return sum;
    }
}