package topic.array.singleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution solution = new Solution();
        int single = solution.singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}