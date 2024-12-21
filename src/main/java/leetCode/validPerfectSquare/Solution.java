package leetCode.validPerfectSquare;

//Given a positive integer num, return true if num is a perfect square or false otherwise.
//A perfect square is an integer that is the square of an integer.
// In other words, it is the product of some integer with itself.
public class Solution {
    public static boolean isPerfectSquare(int num) {
        if (Math.sqrt(num) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}