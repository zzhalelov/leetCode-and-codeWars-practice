package leetCode.array.moveZeroes;

/**
 * 283. Move Zeroes<br>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.<br>
 * Note that you must do this in-place without making a copy of the array.<br><br>
 *
 * <a href="https://leetcode.com/problems/move-zeroes/submissions/1897496977/">Submission link</a>
 */
public class Solution {
    public static void moveZeroes(int[] nums) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }
        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}