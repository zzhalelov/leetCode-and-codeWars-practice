package leetCode.array.smallerNumbers;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * <p>
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * <p>
 * Return the answer in an array.
 * <p>
 * <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/1901921487/">Submission link</a>
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            if (count > 0) {
                array[i] = count;
            } else {
                array[i] = 0;
            }
        }

        return array;
    }
}