package Exceptions.task01;

public class Main {
    public static double sqrt(double x) {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
    }
}
