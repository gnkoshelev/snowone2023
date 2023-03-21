package ru.gnkoshelev.snowone2023._10;

import java.io.Closeable;

public class FinalizableResource implements Closeable {
    public void use() {
        System.out.println("1. Resource using");
    }

    @Override
    public void close() {
        System.out.println("4. Resource closed");
    }

    @Override
    protected void finalize() {
        close();
    }

    public static void main(String[] args) throws InterruptedException {
        FinalizableResource resource = new FinalizableResource();
        resource.use();
        resource = null;
        System.out.println("2. Resource is phantom reachable from now");
        System.gc();// There is no guarantee but normally GC should start
        System.out.println("3. Performing GC");
        Thread.sleep(5_000);
        System.out.println("5. End operations");

        /*
         * Output SHOULD be something like that (but not guaranteed):
         * 1. Resource using
         * 2. Resource is phantom reachable from now
         * 3. Performing GC
         * 4. Resource closed
         * 5. End operations
         */
    }
}
