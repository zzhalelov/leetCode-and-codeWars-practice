package leetCode.map.uniqueNumberOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 * <p>
 * Given an array of integers arr,
 * return true if the number of occurrences of each value in the array is unique or false otherwise.
 * <p>
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/submissions/1957927828/">Submission Link</a>
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println(map);

        for (int value : map.values()) {
            if (!set.contains(value)) {
                set.add(value);
            } else {
                return false;
            }
        }
        return true;
    }
}