package leetCode.string.reverseString;

import java.util.Arrays;

//Write a function that reverses a string. The input string is given as an array of characters
public class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Solution main = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        main.reverseString(input);
        System.out.println(Arrays.toString(input));
    }
}