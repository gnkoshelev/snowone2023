package ru.gnkoshelev.snowone2023._01;

public class OverCommentedCode {
    public static void main(String[] args) {
        System.out.println(quadraticMean(1, 2, 3, 4, 5));
    }

    public static double quadraticMean(double... values) {
        int n = values.length;// Value count
        if (n == 0) {// If values is empty, then throw an exception
            throw new IllegalArgumentException("Need at least 1 value to calculate quadratic mean");
        }
        double s = 0;// Init sum with 0
        for (double v : values) {// Iterate over the values
            s += v * v;// Add squared value to the sum
        }
        s = Math.sqrt(s / n);// Divide the sum by count and calculate the square root
        return s;// Return the average
    }
}
