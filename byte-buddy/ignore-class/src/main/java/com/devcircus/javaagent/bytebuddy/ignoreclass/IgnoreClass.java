package com.devcircus.javaagent.bytebuddy.ignoreclass;

import net.bytebuddy.asm.Advice;

public class IgnoreClass {

    /**
     *
     * @param method
     * @throws Exception
     */
    @Advice.OnMethodExit
    public static void enterMethods(@Advice.Origin String method) throws Exception {
        System.out.println("[AGENT] method " + method);
    }
}
