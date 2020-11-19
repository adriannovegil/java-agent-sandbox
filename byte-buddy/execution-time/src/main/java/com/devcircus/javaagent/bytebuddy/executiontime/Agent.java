package com.devcircus.javaagent.bytebuddy.executiontime;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

/**
 * This is an agent for get execution time of all running methods
 */
public class Agent {

    /**
     *
     * @param arguments
     * @param instrumentation
     */
    public static void premain(String arguments, Instrumentation instrumentation) {
        System.out.println("[AGENT] Agent for time measure");
        new AgentBuilder.Default()
                .with(new AgentBuilder.InitializationStrategy.SelfInjection.Eager())
                .type((ElementMatchers.any()))
                .transform((builder, typeDescription, classLoader, module) -> builder
                .method(ElementMatchers.any())
                .intercept(Advice.to(TimerAdvice.class))
                ).installOn(instrumentation);
    }

}
