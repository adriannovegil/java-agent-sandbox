package com.devcircus.javaagent.bytebuddy.addfield;

import net.bytebuddy.asm.Advice;

public class GetField {

    /**
     * In this class we get the bool and word values before method2 execute
     * method2 should be non-static method.
     *
     * @param bool
     * @param word
     * @throws java.lang.Exception
     */
    @Advice.OnMethodEnter
    public static void getValues(@Advice.FieldValue(value = "bool") boolean bool,
            @Advice.FieldValue(value = "word") String word)
            throws Exception {
        System.out.println("[AGENT] Getting New Fields");
        System.out.println("[AGENT] boolean value is " + bool + " and String value is " + word);
    }
}
