package ru.gnkoshelev.snowone2023._08;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 0)
@Warmup(iterations = 3, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1_000, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
public class NullVsOptionalBenchmark {
    private static final int LIMIT = 1_000;
    public static volatile Object object = new Object();

    private int counter;

    /**
     * Interpret as {@code 1 / failRatio}. The first call of each iteration is always fails
     */
    @Param({"1", "2", "5", "10", "50", "100", "500", "1000", "2147483647"})
    private int failRatio;

    @Setup(Level.Iteration)
    public void setup() {
        counter = 0;
    }

    private static Object findNull(boolean result) {
        if (result) {
            return object;
        } else {
            return null;
        }
    }

    private static Optional<Object> findOptional(boolean result) {
        if (result) {
            return Optional.of(object);
        } else {
            return Optional.empty();
        }
    }


    @Benchmark
    @OperationsPerInvocation(LIMIT)
    public void findNull(Blackhole bh) {
        for (int i = 0; i < LIMIT; i++) {
            Object result = findNull(counter++ % failRatio != 0);
            if (result != null) {
                bh.consume(result);
            } else {
                bh.consume(object);
            }
        }
    }

    @Benchmark
    @OperationsPerInvocation(LIMIT)
    public void findOptional(Blackhole bh) {
        for (int i = 0; i < LIMIT; i++) {
            Optional<Object> result = findOptional(counter++ % failRatio != 0);
            if (result.isPresent()) {
                bh.consume(result);
            } else {
                bh.consume(object);
            }
        }
    }

    /**
     * Baseline to subtract Black hole consuming costs
     *
     * @param bh Black hole
     */
    @Benchmark
    @OperationsPerInvocation(LIMIT)
    public void empty(Blackhole bh) {
        for (int i = 0; i < LIMIT; i++) {
            counter++;
            bh.consume(object);
        }
    }
}
