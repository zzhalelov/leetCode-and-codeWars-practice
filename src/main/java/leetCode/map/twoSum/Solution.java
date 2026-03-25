package leetCode.map.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/submissions/1958841171/">Submission Link</a>
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(current, i);
        }
        return new int[]{};
    }
}