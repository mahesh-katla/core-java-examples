package com.org.test;

public class ABoxing {

     int x = 25;
    public void show(int a, float b)
    {
        System.out.println("Integer"+a*2);
        System.out.println("Float"+b*2);
    }

    public static void main(String[] args) {

        ABoxing abObj =new  ABoxing ();

        Integer a = 10;
        Float b =20f;
        abObj.show(a,b);

    }
}
