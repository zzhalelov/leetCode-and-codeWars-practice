package leetCode.array.maxConsecutiveOnes;

/**
 * 485. Max Consecutive Ones
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * <a href="https://leetcode.com/problems/max-consecutive-ones/submissions/1898601139/">Submission link</a>
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (max <= count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }
}