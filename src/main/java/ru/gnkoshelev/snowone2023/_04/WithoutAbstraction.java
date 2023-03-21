package ru.gnkoshelev.snowone2023._04;

public class WithoutAbstraction {
    public static void main(String[] args) {
        System.out.println(computeWithVectors(1, 0, 0, 0, 1, 0));
    }

    public static double computeWithVectors(
            double x1, double y1, double z1,
            double x2, double y2, double z2) {
        double x = y1 * z2 - z1 * y2;
        double y = z1 * x2 - x1 * z2;
        double z = x1 * y2 - y1 * x2;
        return x * x + y * y + z * z;
    }
}
