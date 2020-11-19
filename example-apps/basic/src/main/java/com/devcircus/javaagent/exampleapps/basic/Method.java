package com.devcircus.javaagent.exampleapps.basic;

public class Method {

    /**
     *
     */
    Method() {
        System.out.println("This is constructor ");
    }

    /**
     *
     */
    public void method1() {
        try {
            Thread.sleep(500);
            System.out.println("This is Method 1");
        } catch (InterruptedException e) {
            //Ignore
        }
    }

    /**
     *
     */
    public void method2() {
        try {
            Thread.sleep(1000);
            System.out.println("This is Method 2");
        } catch (InterruptedException e) {
            //Ignore
        }
    }

    /**
     *
     * @param number
     * @param word
     * @param bool
     */
    public void method4(int number, String word, boolean bool) {
        System.out.println("String :" + word + " and number :" + number + " and boolean :" + bool);
    }
}
