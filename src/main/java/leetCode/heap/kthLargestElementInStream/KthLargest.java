package leetCode.heap.kthLargestElementInStream;

/*
703. Kth Largest Element in a Stream

You are part of a university admissions office and need to keep track of the kth highest test score from applicants in real-time.
This helps to determine cut-off marks for interviews and admissions dynamically as new applicants submit their scores.

https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/1968918599/
 */
public class KthLargest {
    private final int k;
    private final MinHeap heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new MinHeap();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        heap.push(val);

        if (heap.size() > k) {
            heap.pop();
        }

        return heap.peek();
    }
}