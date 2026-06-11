package leetCode.array.minSubArrayLen;

//209. Minimum Size Subarray Sum
//https://leetcode.com/problems/minimum-size-subarray-sum/submissions/2030056424/
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // Сужаем окно слева, пока условие выполняется
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}