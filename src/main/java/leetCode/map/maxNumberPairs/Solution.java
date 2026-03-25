package leetCode.map.maxNumberPairs;

import java.util.HashMap;
import java.util.Map;

/**
 * 1679. Max Number of K-Sum Pairs
 * <p>
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 * <p>
 * <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/submissions/1958860859/">Submission Link</a>
 */
public class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int current : nums) {
            int needed = k - current;

            if (map.containsKey(needed) && map.get(needed) > 0) {
                count++;
                map.put(needed, map.get(needed) - 1);
            } else {
                map.put(current, map.getOrDefault(current, 0) + 1);
            }
        }
        return count;
    }
}