package ru.gnkoshelev.snowone2023._07;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@Fork(value = 1 /* change to 3 */, warmups = 0, jvmArgs = "-XX:-DoEscapeAnalysis")
@Warmup(iterations = 3, time = 1_000, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 2_000, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
public class ProcessBenchmark {
    private int counter;

    public static volatile Object object = new Object();

    /**
     * Interpret as {@code 1 / failRatio}. The first call of each iteration is always fails
     */
    @Param({"1", "2", "5", "10", "50", "100", "500", "1000", "2147483647"})
    private int failRatio;

    @Setup(Level.Iteration)
    public void setup() {
        counter = 0;
    }

    @Benchmark
    public void exceptionalProcess(Blackhole bh) {
        try {
            bh.consume(ExceptionalProcess.process((counter++) % failRatio != 0));
        } catch (Exception ex) {
            bh.consume(ex);
        }
    }

    @Benchmark
    public void resultProcess(Blackhole bh) {
        try {
            ResultProcess.Result<String, String> result = ResultProcess.process((counter++) % failRatio != 0);
            if (result.error() != null) {
                bh.consume(result.error());
            } else {
                bh.consume(result.data());
            }
        } catch (Exception ex) {
            bh.consume(ex);
        }
    }

    @Benchmark
    public void recordResultProcess(Blackhole bh) {
        try {
            RecordResultProcess.RecordResult<String, String> result = RecordResultProcess.process((counter++) % failRatio != 0);
            if (result.error() != null) {
                bh.consume(result.error());
            } else {
                bh.consume(result.data());
            }
        } catch (Exception ex) {
            bh.consume(ex);
        }
    }

    @Benchmark
    public void exceptionDrivenProcess(Blackhole bh) {
        try {
            ExceptionDrivenProcess.process((counter++) % failRatio != 0);
        } catch (ExceptionDrivenProcess.SuccessException ex) {
            bh.consume(ex);
        } catch (ExceptionDrivenProcess.ErrorException ex) {
            bh.consume(ex);
        }
    }

    @Benchmark
    @Fork(value = 1, jvmArgs = "-XX:-StackTraceInThrowable")
    public void exceptionDrivenProcessWithoutStackTrace(Blackhole bh) {
        try {
            ExceptionDrivenProcess.process((counter++) % failRatio != 0);
        } catch (ExceptionDrivenProcess.SuccessException ex) {
            bh.consume(ex);
        } catch (ExceptionDrivenProcess.ErrorException ex) {
            bh.consume(ex);
        }
    }

    /**
     * Baseline to subtract Black hole consuming costs
     *
     * @param bh Black hole
     */
    @Benchmark
    public void baseline(Blackhole bh) {
        bh.consume(object);
    }
}
