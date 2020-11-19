package com.devcircus.javaagent.bytebuddy.constructorinstrument;

import net.bytebuddy.asm.Advice;

public class Constructor {

    /**
     * 
     * @return
     * @throws Exception 
     */
    @Advice.OnMethodEnter
    static long enterConstructor() throws Exception {
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
    static void exitConstructor(@Advice.Origin String method, @Advice.Enter long start) throws Exception {
        long end = System.currentTimeMillis();
        System.out.println("[AGENT] This is Constructor :" + method + "took " + (end - start) + " milliseconds ");
    }
}
