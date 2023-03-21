package ru.gnkoshelev.snowone2023._10;

public class CloseableResource implements AutoCloseable {
    public void use() {
        System.out.println("1. Resource using");
    }

    @Override
    public void close() {
        System.out.println("2. Resource closed");
    }

    public static void main(String[] args) {
        try (var resource = new CloseableResource()) {
            resource.use();
        }
        System.out.println("3. End operations");

        /*
         * Output MUST be like that:
         * 1. Resource using
         * 2. Resource closed
         * 3. End operations
         */

    }
}
