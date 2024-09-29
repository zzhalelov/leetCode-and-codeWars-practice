package topic.math.squareRoot;

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer
public class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) sqrt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(64));
    }
}