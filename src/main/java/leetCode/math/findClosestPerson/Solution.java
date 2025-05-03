package leetCode.math.findClosestPerson;

//3516. Find Closest Person
//You are given three integers x, y, and z, representing the positions of three people on a number line:
//x is the position of Person 1.
//y is the position of Person 2.
//z is the position of Person 3, who does not move.
//Both Person 1 and Person 2 move toward Person 3 at the same speed.
//Determine which person reaches Person 3 first:
//Return 1 if Person 1 arrives first.
//Return 2 if Person 2 arrives first.
//Return 0 if both arrive at the same time.
//Return the result accordingly.

public class Solution {
    public static int findClosest(int x, int y, int z) {
        int p1 = Math.abs(z - x);
        int p2 = Math.abs(z - y);
        if (p1 < p2) {
            return 1;
        } else if (p2 < p1) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findClosest(2, 5, 6));
    }
}