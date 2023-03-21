package ru.gnkoshelev.snowone2023._05;

import com.google.common.primitives.Ints;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Run benchmark with and without the option {@code -XX:-DoEscapeAnalysis}
 * to see the difference in performance due to boxing.
 * <p>
 * Also, check if compiler blackhole support does not affect the result.
 */
@Fork(value = 1, warmups = 0)
@Warmup(iterations = 3, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1_000, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
public class ListIterationBenchmark {
    private final int[] intArray = IntStream.range(1000, 10000).toArray();
    private final Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
    private final List<Integer> guavaArrayList = Ints.asList(intArray);
    private final List<Integer> arraysArrayList = Arrays.asList(integerArray);

    @Setup(value = Level.Iteration)
    public void setup() {

    }

    @Benchmark
    public void iterateGuavaArrayList(Blackhole bh) {
        int sum = 0;
        for (Integer i : guavaArrayList) {
            sum += i;
        }
        bh.consume(sum);
    }

    @Benchmark
    public void iterateArraysArrayList(Blackhole bh) {
        int sum = 0;
        for (Integer i : arraysArrayList) {
            sum += i;
        }
        bh.consume(sum);
    }
}
