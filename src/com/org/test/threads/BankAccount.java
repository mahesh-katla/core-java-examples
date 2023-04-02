package com.org.test.threads;

public class BankAccount {

    private double balance = 2000;

    public synchronized double deposit(double amount) {

        balance = balance + amount;
        System.out.println("inside deposit "+amount);

        notify();

        return balance;
    }

    public synchronized double withdraw(double amount) {
        System.out.println("inside withdraw "+ amount);
        if (balance < amount)
            System.out.println("In sufficent Balance ");

            while(balance > amount){
            try {
                System.out.println("inside withdraw "+ amount);
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance = balance - amount;

        return balance;
    }

    public static void main(String[] args) {

        final BankAccount bk1 = new BankAccount();

        Thread t1 = new Thread() {
            public void run() {
                bk1.withdraw(4000);
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                bk1.deposit(3000);
            }
        };
        t2.start();
    }
}


