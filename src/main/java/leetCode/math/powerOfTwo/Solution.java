package leetCode.math.powerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPowerOfTwo(3);
    }
}