package com.org.test.threads;

public class Example_3 {
    public static void main(String[] args) {
        ExRunnable r = new ExRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

