package ru.gnkoshelev.snowone2023._01;

public class SelfDocumentedCode {
    public static void main(String[] args) {
        System.out.println(rootMeanSquare(1, 2, 3, 4, 5));
    }

    public static double rootMeanSquare(double... values) {
        int valueCount = values.length;
        if (valueCount == 0) {
            throw new IllegalArgumentException("Need at least 1 value to calculate quadratic mean");
        }
        double sumOfValueSquares = 0;
        for (double value : values) {
            sumOfValueSquares += value * value;
        }
        double rootMeanSquare = Math.sqrt(sumOfValueSquares / valueCount);
        return rootMeanSquare;
    }
}
