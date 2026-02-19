package leetCode.array.runningSum;

/**
 * 1480. Running Sum of 1d Array<br>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <br>
 * Return the running sum of nums.
 * <br><br>
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/submissions/1898481400/">Submission link</a>
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
}