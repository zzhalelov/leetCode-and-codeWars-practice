package leetCode.set.findDifferenceTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2215. Find the Difference of Two Arrays
 * <p>
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * <p>
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * <p>
 * Note that the integers in the lists may be returned in any order.
 * <p>
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/submissions/1937679930/">Submission link</a>
 */
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> resultList = new ArrayList<>();

        for (int num : nums1)
            set1.add(num);
        for (int num : nums2)
            set2.add(num);

        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        resultList.add(list1);
        resultList.add(list2);
        return resultList;
    }
}