package com.devcircus.javaagent.bytebuddy.getmethods;

import net.bytebuddy.asm.Advice;

public class AllMethod {

    /**
     *
     * @param method
     * @throws Exception
     */
    @Advice.OnMethodExit
    static void getAllMethods(@Advice.Origin String method) throws Exception {
        System.out.println("[AGENT] " + method);
    }
}
