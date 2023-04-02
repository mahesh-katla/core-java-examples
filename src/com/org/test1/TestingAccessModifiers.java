package com.org.test1;

import com.org.test.ABoxing;

public class TestingAccessModifiers {


    public  static  void main(String args[]){
        ABoxing abObj1 =new  ABoxing ();
        System.out.println(abObj1);
        abObj1.show(10,10);
    }
}
