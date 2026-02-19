package leetCode.array.findPivotIndex;

/**
 * 724. Find Pivot Index<br>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * <a href="https://leetcode.com/problems/find-pivot-index/submissions/1898525211/">Submission link</a>
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        //prefix
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        //suffix
        int[] suffix = new int[nums.length];

        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        //find pivot index
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == suffix[i]) {
                pivot = i;
                break;
            } else {
                pivot = -1;
            }
        }

        return pivot;
    }
}