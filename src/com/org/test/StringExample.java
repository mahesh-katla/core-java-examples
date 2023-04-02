package com.org.test;

public class StringExample {
    public static void main(String args[]){

      /*  String s1 = "testing";
        String s3 = "testing";

        String s2 = new String("testing");
        String s4 = new String("testing");

        System.out.println(s1==s3);
        System.out.println(s2==s4);

        System.out.println(s2.equals(s3));*/

        String s1="Java";

        String s2=s1.concat("Beans");
        String s3="Enterprise " + s2;
        System.out.println(s1.charAt(0));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java");
        stringBuilder.append("Beans");
        stringBuilder.append("Enterprise");
        System.out.println(stringBuilder.toString());


    }
}
