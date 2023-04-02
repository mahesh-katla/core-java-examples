package com.org.test;

class Values {
    private int a ;
    private float b;
    private String c;

    public void display() {
        int z ;
        System.out.println("integer" + a);
        System.out.println("float" + b);
        System.out.println("String" + c);
    }

    public void display(int x) {
        System.out.println(x);
    }

    public void display(Values x) {
        System.out.println(x);
    }

}