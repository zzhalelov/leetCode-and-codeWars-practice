package leetCode.set.missingNumber;

import java.util.HashSet;
import java.util.Set;

/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
https://leetcode.com/problems/missing-number/submissions/1968939174/?envType=problem-list-v2&envId=hash-table
 */
public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int n : nums) {
            set.add(n);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res = i;
            }
        }
        return res;
    }
}