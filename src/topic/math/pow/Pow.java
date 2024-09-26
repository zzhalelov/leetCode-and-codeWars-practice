package topic.math.pow;

public class Pow {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2, 10));
    }
}