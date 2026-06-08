package leetCode.array.findMaxAverage;

//643. Maximum Average Subarray I
//https://leetcode.com/problems/maximum-average-subarray-i/submissions/2026722367/
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            maxSum = currentSum;
        }

        for (int right = k; right < nums.length; right++) {
            currentSum += nums[right];
            currentSum -= nums[right - k];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return (double) maxSum / k;
    }
}