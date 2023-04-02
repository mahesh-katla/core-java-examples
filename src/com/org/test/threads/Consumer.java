package com.org.test.threads;

import java.util.ArrayList;

class Consumer implements Runnable {

    private ArrayList<Integer> arrayList;

    public Consumer(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;

    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {

        while(true) {
            try {
                consume();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (arrayList) {

            while (arrayList.isEmpty()) {

                System.out.println("The Queue is empty. Consumer thread needs to wait.");
                arrayList.wait();
            }

            int data = arrayList.remove(--ProducerConsumerExample.i);
            System.out.println("Removed Element: " + data);
            arrayList.notify();
            Thread.sleep(3000);
        }
    }
}

