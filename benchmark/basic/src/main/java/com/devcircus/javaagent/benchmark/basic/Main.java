package com.devcircus.javaagent.benchmark.basic;

import com.devcircus.javaagent.benchmark.basic.benchmark.ClassByExtensionBenchmark;
import com.devcircus.javaagent.benchmark.basic.benchmark.ClassByImplementationBenchmark;
import com.devcircus.javaagent.benchmark.basic.benchmark.StubInvocationBenchmark;
import com.devcircus.javaagent.benchmark.basic.benchmark.SuperClassInvocationBenchmark;
import com.devcircus.javaagent.benchmark.basic.benchmark.TrivialClassCreationBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * A runner for completing a benchmark with only one JMH fork. This benchmark
 * completes rather quick and can give a great first performance indication. A
 * published benchmark should rather be backed by an execution with additional
 * forks.
 */
public class Main {

    /**
     * A wildcard for the identification of a benchmark by JMH.
     */
    private static final String WILDCARD = ".*";

    /**
     * Executes the benchmark.
     *
     * @param args Unused arguments.
     * @throws org.openjdk.jmh.runner.RunnerException in case of error
     */
    public static void main(String[] args) throws RunnerException {
        new Runner(new OptionsBuilder()
                .include(WILDCARD + SuperClassInvocationBenchmark.class.getSimpleName() + WILDCARD)
                .include(WILDCARD + StubInvocationBenchmark.class.getSimpleName() + WILDCARD)
                .include(WILDCARD + ClassByImplementationBenchmark.class.getSimpleName() + WILDCARD)
                .include(WILDCARD + ClassByExtensionBenchmark.class.getSimpleName() + WILDCARD)
                .include(WILDCARD + TrivialClassCreationBenchmark.class.getSimpleName() + WILDCARD)
                .forks(0) // Should rather be 1 but there seems to be a bug in JMH.
                .build()).run();
    }
}
