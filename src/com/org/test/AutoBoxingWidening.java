package com.org.test;

public class AutoBoxingWidening {
    static void m(int i){ // widening
        System.out.println("int");}
    static void m(Integer i){
        System.out.println("Integer");
    }

    public static void main(String args[]){
        short s=30;
        m(s);
    }
}
