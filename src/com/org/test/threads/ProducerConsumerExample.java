package com.org.test.threads;

import java.util.ArrayList;

public class ProducerConsumerExample {
    static int i = 0;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Thread producer = new Thread(new Producer(arrayList), "Producer Thread");
        Thread consumer = new Thread(new Consumer(arrayList), "Consumer Thread");
        producer.start();
        consumer.start();
    }
}
