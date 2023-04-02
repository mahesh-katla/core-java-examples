package com.org.test.threads;

import java.util.ArrayList;

class Producer implements Runnable {


    private ArrayList<Integer> arrayList;
    private static final int MAX_SIZE = 5;

    public Producer(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;

    }

    @Override
    public void run() {

        while(true) {
            try {
                produce();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private void produce() throws InterruptedException {
        synchronized (arrayList) {
            while (arrayList.size() == MAX_SIZE) {

                System.out.println("The Queue is Full. Producer thread needs to wait.");

                arrayList.wait();
            }
            System.out.println("Added Element: " + ProducerConsumerExample.i);
            arrayList.add(ProducerConsumerExample.i++);
            arrayList.notify();
            Thread.sleep(3000);
        }
    }
}