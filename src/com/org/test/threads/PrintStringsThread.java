package com.org.test.threads;

public class PrintStringsThread implements Runnable {

    String str1, str2;

    PrintStringsThread(String str1, String str2) {

        this.str1 = str1;
        this.str2 = str2;

        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        TwoStrings.print(str1, str2);

    }
}

