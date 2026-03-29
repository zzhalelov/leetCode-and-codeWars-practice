package leetCode.priorityQueue.kthLargestElement;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 215. Kth Largest Element in an Array
 * <p>
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/1962882271/">Submission Link</a>
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        for (int num : nums) {
            pq.add(num);
        }

        int res = 0;
        for (int i = 0; i < k; i++) {
            res = pq.poll();
        }
        return res;
    }
}