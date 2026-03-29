package leetCode.priorityQueue.topKFrequentElements;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 * <p>
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/submissions/1962900406/">Submission Link</a>
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freqA = counts.get(a);
            int freqB = counts.get(b);

            if (freqA != freqB) {
                return freqB - freqA;
            }
            return a - b;
        });
        for (int num : counts.keySet()) {
            pq.add(num);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}