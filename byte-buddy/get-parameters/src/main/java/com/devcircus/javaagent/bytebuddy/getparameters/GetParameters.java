package com.devcircus.javaagent.bytebuddy.getparameters;

import net.bytebuddy.asm.Advice;

public class GetParameters {

    /**
     *
     * @param method
     * @param para
     * @throws Exception
     */
    @Advice.OnMethodExit
    public static void getParametrs(@Advice.Origin String method, @Advice.AllArguments Object[] para) throws Exception {
        System.out.println("[AGENT] " + method);
        /**
         * This is use for get class of parameters to get an idea what we can do
         * using this advice
         */
        System.out.println("[AGENT] Class names of parameters");
        for (int i = 0; i < 3; i++) {
            System.out.println("[AGENT]   " + para[i].getClass());
        }
        /**
         * This is a way we can access to each parameters separately using agent
         * advice For this we want an idea about parameters class , so from
         * above we can get class of parameters and we can use them as follows
         * or as we need.
         */
        System.out.println("[AGENT] Get parameters values");
        int number = (int) para[0];
        System.out.println("[AGENT] number is :" + number);
        String name = (String) para[1];
        System.out.println("[AGENT] " + "name is :" + name);
        boolean run = (boolean) para[2];
        System.out.println("[AGENT] run is :" + run);
    }
}
