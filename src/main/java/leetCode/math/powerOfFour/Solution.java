package leetCode.math.powerOfFour;

public class Solution {
    public static boolean isPowerOfFour(int n) {

        for (int i = 0; i <= 15; ++i) {
            if (Math.pow(4, i) == n) {
                return true;
            }
        }
        return false;
    }
}