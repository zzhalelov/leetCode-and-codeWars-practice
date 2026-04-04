package leetCode.priorityQueue.topKFrequentWords;

import java.util.*;

/**
 * 692. Top K Frequent Words
 * <p>
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * <p>
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 * <p>
 * <a href="https://leetcode.com/problems/top-k-frequent-words/submissions/1962929914/">Submission Link</a>
 */
public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> counts = new HashMap<>();
        for (String s : words) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqA = counts.get(a);
            int freqB = counts.get(b);

            if (freqA != freqB) {
                return freqB - freqA;
            }
            return a.compareTo(b);
        });
        for (String s : counts.keySet()) {
            pq.add(s);
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll());
        }
        return res;
    }
}