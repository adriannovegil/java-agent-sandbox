package com.devcircus.javaagent.bytebuddy.addfield;

import net.bytebuddy.asm.Advice;

/**
 * In this class we set the bool and word values after the constructor
 */
public class SetField {

    @Advice.OnMethodExit
    public static void setValues(@Advice.FieldValue(value = "bool", readOnly = false) boolean bool,
            @Advice.FieldValue(value = "word", readOnly = false) String word)
            throws Exception {
        System.out.println("[AGENT] Adding boolean (true) and String (New String Field) Fields ");
        bool = true;
        word = "New String Field";
    }
}
