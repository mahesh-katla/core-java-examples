package com.org.test.threads;

public class MainThreadExample {

    public static void main(String args[]){
        Thread thread = Thread.currentThread();
        System.out.println("Main thread's original name is " + thread.getName());
        thread.setName("The Main Thread");
        System.out.println("Main thread's name is now " +
                thread.getName());

    }
}
