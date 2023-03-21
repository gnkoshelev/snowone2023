package ru.gnkoshelev.snowone2023._10;

import java.lang.ref.Cleaner;

public class CleanableResource implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    public CleanableResource() {
        Runnable clean = () -> {
            /* Cleaning operation without referencing to 'this'. */
            System.out.println("4. Perform cleaning");
        };
        cleanable = cleaner.register(this, clean);
    }

    public void use() {
        System.out.println("1. Resource using");
    }

    @Override
    public void close() {
        cleanable.clean();
    }

    public static void main(String[] args) throws InterruptedException {
        CleanableResource resource = new CleanableResource();
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
         * 4. Perform cleaning
         * 5. End operations
         */
    }
}
