package topic.math.palindromeNumber;

//Given an integer x, return true if x is a palindrome, and false otherwise
public class Solution {
    public boolean isPalindrome(int x) {
        String inputString = String.valueOf(x);
        String reversedString = new StringBuffer(inputString).reverse().toString();
        return inputString.equals(reversedString);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(123321));
    }
}