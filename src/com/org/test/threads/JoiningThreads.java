package com.org.test.threads;

public class JoiningThreads {
    public static void main(String[] args) {

        Thread t = new Thread( ) {
            public void run( ) {
                System.out.println("Reading");

                try {

                    System.in.read( );

                } catch (java.io.IOException ex) {

                }

                System.out.println("Thread Finished.");
            }
        };
        System.out.println("Starting");

        t.start( );

        System.out.println("Joining");

        /*try {

            t.join( );

        } catch (InterruptedException ex) {

            ex.printStackTrace();

        }*/

        System.out.println("Main Finished.");

    }


}
