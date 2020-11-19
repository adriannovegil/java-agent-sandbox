package com.devcircus.javaagent.bytebuddy.constructorinstrument;

import net.bytebuddy.asm.Advice;

public class Methods {

    /**
     * 
     * @return
     * @throws Exception 
     */
    @Advice.OnMethodEnter
    static long enterMethods() throws Exception {
        long start = System.currentTimeMillis();
        return start;
    }

    /**
     * 
     * @param method
     * @param start
     * @throws Exception 
     */
    @Advice.OnMethodExit
    static void exitMethods(@Advice.Origin String method, @Advice.Enter long start) throws Exception {
        long end = System.currentTimeMillis();
        System.out.println("[AGENT] This is Method :" + method + "took " + (end - start) + " milliseconds ");
    }
}
