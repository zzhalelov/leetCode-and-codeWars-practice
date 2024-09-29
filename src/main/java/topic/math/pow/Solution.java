package topic.math.pow;

//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        double res = s1.myPow(2.00000, -2);
        System.out.println(res);
    }
}