package com.org.test.interfaces;

public interface Steerable1 {

    void steerAround();


    default  void turnRight(int x){
        System.out.println(" inside default method");
    }
}
