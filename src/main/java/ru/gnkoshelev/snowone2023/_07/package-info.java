/**
 * Benchmark results:
 * <pre>
 * Benchmark                                                 (failRatio)  Mode  Cnt    Score    Error  Units
 * ProcessBenchmark.empty                                              1  avgt    5    2.725 ±  0.051  ns/op
 * ProcessBenchmark.empty                                              2  avgt    5    2.720 ±  0.046  ns/op
 * ProcessBenchmark.empty                                              5  avgt    5    2.725 ±  0.033  ns/op
 * ProcessBenchmark.empty                                             10  avgt    5    2.777 ±  0.532  ns/op
 * ProcessBenchmark.empty                                             50  avgt    5    2.776 ±  0.180  ns/op
 * ProcessBenchmark.empty                                            100  avgt    5    2.736 ±  0.095  ns/op
 * ProcessBenchmark.empty                                            500  avgt    5    2.743 ±  0.127  ns/op
 * ProcessBenchmark.empty                                           1000  avgt    5    2.749 ±  0.107  ns/op
 * ProcessBenchmark.empty                                     2147483647  avgt    5    2.725 ±  0.063  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                             1  avgt    5  645.310 ±  2.572  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                             2  avgt    5  647.682 ±  4.328  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                             5  avgt    5  644.445 ±  4.775  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                            10  avgt    5  645.337 ±  3.772  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                            50  avgt    5  640.497 ±  4.392  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                           100  avgt    5  641.115 ±  6.571  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                           500  avgt    5  638.517 ±  8.455  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                          1000  avgt    5  642.891 ±  4.471  ns/op
 * ProcessBenchmark.exceptionDrivenProcess                    2147483647  avgt    5  645.143 ± 10.948  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace            1  avgt    5   65.345 ±  1.469  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace            2  avgt    5   68.069 ± 17.308  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace            5  avgt    5   83.217 ± 11.580  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace           10  avgt    5   74.202 ±  3.770  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace           50  avgt    5   67.042 ±  0.861  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace          100  avgt    5   66.007 ±  0.605  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace          500  avgt    5   66.317 ±  8.762  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace         1000  avgt    5   65.478 ±  1.035  ns/op
 * ProcessBenchmark.exceptionDrivenProcessWithoutStackTrace   2147483647  avgt    5   65.874 ±  4.721  ns/op
 * ProcessBenchmark.exceptionProcess                                   1  avgt    5  642.602 ±  5.368  ns/op
 * ProcessBenchmark.exceptionProcess                                   2  avgt    5  323.427 ±  2.723  ns/op
 * ProcessBenchmark.exceptionProcess                                   5  avgt    5  130.551 ±  0.856  ns/op
 * ProcessBenchmark.exceptionProcess                                  10  avgt    5   66.263 ±  0.629  ns/op
 * ProcessBenchmark.exceptionProcess                                  50  avgt    5   15.625 ±  0.155  ns/op
 * ProcessBenchmark.exceptionProcess                                 100  avgt    5    9.216 ±  0.234  ns/op
 * ProcessBenchmark.exceptionProcess                                 500  avgt    5    4.146 ±  0.210  ns/op
 * ProcessBenchmark.exceptionProcess                                1000  avgt    5    3.512 ±  0.494  ns/op
 * ProcessBenchmark.exceptionProcess                          2147483647  avgt    5    2.791 ±  0.068  ns/op
 * ProcessBenchmark.recordResultProcess                                1  avgt    5    2.793 ±  0.024  ns/op
 * ProcessBenchmark.recordResultProcess                                2  avgt    5    3.029 ±  0.061  ns/op
 * ProcessBenchmark.recordResultProcess                                5  avgt    5    2.985 ±  0.047  ns/op
 * ProcessBenchmark.recordResultProcess                               10  avgt    5    2.990 ±  0.034  ns/op
 * ProcessBenchmark.recordResultProcess                               50  avgt    5    3.148 ±  0.037  ns/op
 * ProcessBenchmark.recordResultProcess                              100  avgt    5    3.055 ±  0.089  ns/op
 * ProcessBenchmark.recordResultProcess                              500  avgt    5    3.022 ±  0.205  ns/op
 * ProcessBenchmark.recordResultProcess                             1000  avgt    5    3.017 ±  0.076  ns/op
 * ProcessBenchmark.recordResultProcess                       2147483647  avgt    5    2.949 ±  0.097  ns/op
 * ProcessBenchmark.resultProcess                                      1  avgt    5    2.799 ±  0.018  ns/op
 * ProcessBenchmark.resultProcess                                      2  avgt    5    3.053 ±  0.098  ns/op
 * ProcessBenchmark.resultProcess                                      5  avgt    5    3.090 ±  0.393  ns/op
 * ProcessBenchmark.resultProcess                                     10  avgt    5    2.987 ±  0.125  ns/op
 * ProcessBenchmark.resultProcess                                     50  avgt    5    3.178 ±  0.125  ns/op
 * ProcessBenchmark.resultProcess                                    100  avgt    5    3.094 ±  0.226  ns/op
 * ProcessBenchmark.resultProcess                                    500  avgt    5    2.993 ±  0.091  ns/op
 * ProcessBenchmark.resultProcess                                   1000  avgt    5    2.969 ±  0.050  ns/op
 * ProcessBenchmark.resultProcess                             2147483647  avgt    5    3.089 ±  1.052  ns/op
 * </pre>
 */
package ru.gnkoshelev.snowone2023._07;
