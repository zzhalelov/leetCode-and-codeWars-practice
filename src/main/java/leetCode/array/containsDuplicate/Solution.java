package leetCode.array.containsDuplicate;

import java.util.HashSet;
import java.util.Set;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> solution = new HashSet<>();
        for (int num : nums) {
            if (solution.contains(num)) {
                return true;
            }
            solution.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Solution solution = new Solution();
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result);
    }
}