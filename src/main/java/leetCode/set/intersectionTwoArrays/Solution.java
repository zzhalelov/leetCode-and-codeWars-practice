package leetCode.set.intersectionTwoArrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * <p>
 * Each element in the result must be unique and you may return the result in any order.
 * <p>
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/submissions/1937542232/">Submission link</a>
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int j : nums2) {
            if (set.contains(j)) {
                resultSet.add(j);
            }
        }

        int[] arr = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet) {
            arr[index++] = num;
        }
        return arr;
    }
}