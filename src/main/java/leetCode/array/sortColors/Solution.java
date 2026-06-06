package leetCode.array.sortColors;

//75. Sort Colors
//https://leetcode.com/problems/sort-colors/submissions/2024666893/
public class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int current = 0;

        while (current <= right) {
            if (nums[current] == 0) {
                int temp = nums[left];
                nums[left] = nums[current];
                nums[current] = temp;
                left++;
                current++;
            } else if (nums[current] == 1) {
                current++;
            } else {
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}