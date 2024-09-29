package leetCode.string.stringArraysEquivalent;
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise
//A string is represented by an array if the array elements concatenated in order forms the string
public class Solution {
    private String combineStrings(String[] word) {
        StringBuilder sb = new StringBuilder();
        for (String str : word) {
            sb.append(str);
        }
        return sb.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return combineStrings(word1).equals(combineStrings(word2));
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};
        solution.arrayStringsAreEqual(word1, word2);
        System.out.println(solution.arrayStringsAreEqual(word1, word2));
    }
}