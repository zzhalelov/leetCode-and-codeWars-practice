package leetCode.array.separateDigits;

/*
Given an array of positive integers nums, return an array answer
that consists of the digits of each integer in nums after separating them in the same order they appear in nums.
To separate the digits of an integer is to get all the digits it has in the same order.
For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].

https://leetcode.com/problems/separate-the-digits-in-an-array/submissions/1974447435/
 */
public class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int n : nums) {
            sb.append(n);
        }

        int[] result = new int[sb.length()];
        String[] s = sb.toString().split("");
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
}