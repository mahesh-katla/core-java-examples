package com.org.test;

//we are passing object as a value
public class PassByValue1 {

    int data=50;

    void change(PassByValue1 op){ //we are passing object as a value
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        PassByValue1 op=new PassByValue1();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
