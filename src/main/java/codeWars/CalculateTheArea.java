package codeWars;

public class CalculateTheArea {
    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        // Your code here
        double radians = 2 * Math.PI / numberOfSides;
        double square = ((numberOfSides * circleRadius * circleRadius * Math.sin(radians)) / 2);
        return Math.round(square * 1000.0) / 1000.0;
    }

    public static void main(String[] args) {
        areaOfPolygonInsideCircle(3, 3);
        System.out.println(areaOfPolygonInsideCircle(3, 3));
    }
}