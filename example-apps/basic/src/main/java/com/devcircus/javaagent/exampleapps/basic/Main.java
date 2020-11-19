package com.devcircus.javaagent.exampleapps.basic;

/**
 * Sample class for run and test agents
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This is Sample main");
        Method method = new Method();
        method.method1();
        method.method2();
        method.method4(4, "parameters", true);
    }
}
