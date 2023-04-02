package com.org.test;

public class DefaultVales {

    public static void main(String[] args) {

        Values v = new Values();
        v.display();
        int z = 20;
        v.display(z);
        System.out.println(v);
        v.display(v);
        Integer iwrap = new Integer(20);
        iwrap.longValue();
        String x = "10";
        //int re = z+x;

        Integer xint = Integer.parseInt(x);
        int result = xint.intValue()+z;
        System.out.println(result);
    }
}
