package leetCode.math.convertNumberToHexadecimal;

//Given an integer num, return a string representing its hexadecimal representation
public class Solution {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.toHex(26));
    }
}