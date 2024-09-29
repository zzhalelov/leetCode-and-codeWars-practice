package codeWars;

public class Circle {
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println(area(43.2673));
    }
}
