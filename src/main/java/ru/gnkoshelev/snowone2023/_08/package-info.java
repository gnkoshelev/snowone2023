/**
 * Benchmark results:
 * <pre>
 * Benchmark                             (failRatio)  Mode  Cnt  Score   Error  Units
 * NullVsOptionalBenchmark.empty                   1  avgt    5  2.780 ± 0.111  ns/op
 * NullVsOptionalBenchmark.empty                   2  avgt    5  2.808 ± 0.075  ns/op
 * NullVsOptionalBenchmark.empty                   5  avgt    5  2.816 ± 0.136  ns/op
 * NullVsOptionalBenchmark.empty                  10  avgt    5  2.782 ± 0.011  ns/op
 * NullVsOptionalBenchmark.empty                  50  avgt    5  2.782 ± 0.028  ns/op
 * NullVsOptionalBenchmark.empty                 100  avgt    5  2.834 ± 0.248  ns/op
 * NullVsOptionalBenchmark.empty                 500  avgt    5  2.783 ± 0.048  ns/op
 * NullVsOptionalBenchmark.empty                1000  avgt    5  2.778 ± 0.021  ns/op
 * NullVsOptionalBenchmark.empty          2147483647  avgt    5  2.776 ± 0.033  ns/op
 * NullVsOptionalBenchmark.findNull                1  avgt    5  2.724 ± 0.016  ns/op
 * NullVsOptionalBenchmark.findNull                2  avgt    5  2.705 ± 0.028  ns/op
 * NullVsOptionalBenchmark.findNull                5  avgt    5  2.696 ± 0.007  ns/op
 * NullVsOptionalBenchmark.findNull               10  avgt    5  2.700 ± 0.025  ns/op
 * NullVsOptionalBenchmark.findNull               50  avgt    5  2.682 ± 0.003  ns/op
 * NullVsOptionalBenchmark.findNull              100  avgt    5  2.694 ± 0.026  ns/op
 * NullVsOptionalBenchmark.findNull              500  avgt    5  2.674 ± 0.031  ns/op
 * NullVsOptionalBenchmark.findNull             1000  avgt    5  2.669 ± 0.028  ns/op
 * NullVsOptionalBenchmark.findNull       2147483647  avgt    5  2.717 ± 0.003  ns/op
 * NullVsOptionalBenchmark.findOptional            1  avgt    5  2.794 ± 0.026  ns/op
 * NullVsOptionalBenchmark.findOptional            2  avgt    5  3.217 ± 0.002  ns/op
 * NullVsOptionalBenchmark.findOptional            5  avgt    5  3.871 ± 0.053  ns/op
 * NullVsOptionalBenchmark.findOptional           10  avgt    5  4.014 ± 0.042  ns/op
 * NullVsOptionalBenchmark.findOptional           50  avgt    5  4.321 ± 0.037  ns/op
 * NullVsOptionalBenchmark.findOptional          100  avgt    5  4.235 ± 0.010  ns/op
 * NullVsOptionalBenchmark.findOptional          500  avgt    5  4.172 ± 0.042  ns/op
 * NullVsOptionalBenchmark.findOptional         1000  avgt    5  4.169 ± 0.023  ns/op
 * NullVsOptionalBenchmark.findOptional   2147483647  avgt    5  4.125 ± 0.063  ns/op
 * </pre>
 */
package ru.gnkoshelev.snowone2023._08;
