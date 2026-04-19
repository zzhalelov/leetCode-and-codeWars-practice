package leetCode.array.alternatingSum;

/*
You are given an integer array nums.
The alternating sum of nums is the value obtained by adding elements at even indices and subtracting elements at odd indices.
That is, nums[0] - nums[1] + nums[2] - nums[3]...
Return an integer denoting the alternating sum of nums.
https://leetcode.com/problems/compute-alternating-sum/submissions/1974237166/
 */
public class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }
        return sum;
    }
}