package topic.hashTable.twoSum;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
//You may assume that each input would have exactly one solution, and you may not use the same element twice
//You can return the answer in any order
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }
            numIndices.put(nums[i], i);
        }
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}