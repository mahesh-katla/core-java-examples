package com.org.test;

public class AutoBoxingVarArgs1 {

    private static int x =10;
    private int y= 20;

    static void m(Integer i){
        System.out.println("Integer");
    }
    static void m(Integer... i){
        System.out.println("Integer...");
    }

    public static void main(String args[]){
        int a=30;
        m(a);

        AutoBoxingVarArgs1 obj1 = new AutoBoxingVarArgs1();
        obj1.y = 50;
        obj1.x = 30;
        System.out.println( obj1.x);
        System.out.println( obj1.y);

        AutoBoxingVarArgs1 obj2 = new AutoBoxingVarArgs1();
        obj2.y=30;
        System.out.println( obj2.x);
        System.out.println( obj2.y);
        System.out.println(obj1);

    }
}
