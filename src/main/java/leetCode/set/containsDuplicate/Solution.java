package leetCode.set.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * <p>
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * <p></p>
 * <a href="https://leetcode.com/problems/contains-duplicate/submissions/1936727486/">Submission link</a>
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) return true;
            else set.add(n);
        }
        return false;
    }
}