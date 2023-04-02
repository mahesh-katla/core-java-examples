package com.org.test.threads;

public class Example_5 {
    public static void main (String [] args) {
        NameRunnable nr = new NameRunnable(); // Make one Runnable

        Thread one = new Thread(nr);
        one.setName("ash");

        Thread two = new Thread(nr);
        two.setName("bash");

        Thread three = new Thread(nr);
        three.setName("clash");

        one.start();
        two.start();
        three.start();
    }
}
