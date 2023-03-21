package ru.gnkoshelev.snowone2023._04;

public class WithAbstraction {
    public static void main(String[] args) {
        System.out.println(computeWithRawScalars(1, 0, 0, 0, 1, 0));
    }

    public static double computeWithRawScalars(
            double x1, double y1, double z1,
            double x2, double y2, double z2) {
        Vector v1 = new Vector(x1, y1, z1);
        Vector v2 = new Vector(x2, y2, z2);
        return v1.crossProduct(v2).squared();
    }

    public final static class Vector {
        private final double x, y, z;

        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double squared() {
            return x * x + y * y + z * z;
        }

        public Vector crossProduct(Vector v) {
            return new Vector(
                    y * v.z - z * v.y,
                    z * v.x - x * v.z,
                    x * v.y - y * v.x);
        }
    }
}
