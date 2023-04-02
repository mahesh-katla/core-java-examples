package com.org.test.threads;

public class ThreadInterupt {

    public static void main(String[] args) {

        Example ex1 = new Example();

        ex1.start();

        ex1.interrupt();

        Example ex2 = new Example();

        ex2.start();
    }
}
