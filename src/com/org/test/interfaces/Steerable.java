package com.org.test.interfaces;

public interface Steerable {
    int maxTurn = 135;
    void turnLeft(int deg);

    default  void turnRight(int x){
        System.out.println(" inside default method");
    }


}
