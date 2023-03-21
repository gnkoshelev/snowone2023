package ru.gnkoshelev.snowone2023._01;

public class WellDocumentedCode {
    public static void main(String[] args) {
        System.out.println(quadraticMean(1, 2, 3, 4, 5));
    }

    /**
     * Calculate root mean square (or quadratic mean).
     * <p>
     * Need at least 1 value to calculate quadratic mean.
     *
     * @param values non-empty array of values
     * @return quadratic mean
     * @throws IllegalArgumentException if no values provided
     * @see <a href="https://en.wikipedia.org/wiki/Root_mean_square">root mean square (wiki)</a>
     */
    public static double quadraticMean(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Need at least 1 value to calculate quadratic mean");
        }
        double sum = 0;
        for (double value : values) {
            sum += value * value;
        }
        return Math.sqrt(sum / values.length);
    }
}
