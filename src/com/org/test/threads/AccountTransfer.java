package com.org.test.threads;

public class AccountTransfer {
    private String pack;
    private boolean transfer = true;

    public synchronized String recieve(){

        while(transfer){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        transfer = true;
        String pack1 = pack;
        notifyAll();
        return  pack1;
    }

    public synchronized void send(String pack){
        while(!transfer){
            try {
                wait();
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
        transfer = false;

        this.pack = pack;
        notifyAll();
    }

}
