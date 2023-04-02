package com.org.test;

public class Overloading {

    public Integer add(Integer a , Integer b)
    {
        Integer c = a+b;

        return c+100;
    }

    public long add(int a , int b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        Overloading olObj = new Overloading();

        System.out.println(olObj.add(45, 55));



    }

}
