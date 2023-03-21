package ru.gnkoshelev.snowone2023._06;

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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 0)
@Warmup(iterations = 3, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1_000, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
public class PushPopBenchmark {
    private final Object obj = new Object();
    private List<Object> arrayList = new ArrayList<>(10000);
    private List<Object> linkedList = new LinkedList<>();
    private Deque<Object> arrayDeque = new ArrayDeque<>(10000);

    @Setup(value = Level.Trial)
    public void setup() {
        clearAndFill(arrayList, obj, 9000);
        clearAndFill(linkedList, obj, 9000);
        clearAndFill(arrayDeque, obj, 9000);
    }

    @Benchmark
    public void pushPopArrayList(Blackhole bh) {
        arrayList.add(0, obj);
        arrayList.remove(0);
    }

    @Benchmark
    public void pushPopArrayDeque(Blackhole bh) {
        linkedList.add(0, obj);
        linkedList.remove(0);
    }

    @Benchmark
    public void pushPopLinkedList(Blackhole bh) {
        arrayDeque.addFirst(obj);
        arrayDeque.removeFirst();
    }

    private static <T> void clearAndFill(Collection<T> list, T obj, int elements) {
        list.clear();
        for (int i = 0; i < elements; i++) {
            list.add(obj);
        }
    }
}
