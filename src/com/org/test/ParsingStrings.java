package com.org.test;

public class ParsingStrings
{
    public static void main(String args[])
    {
        int ino=Integer.parseInt("10");
        float fno = Float.parseFloat("20.9");
        double dno = Double.parseDouble("20");
        Long lno = Long.parseLong("889");

        System.out.println("Integer value" +ino );
        String strIno = Integer.toString(ino);
        System.out.println("String Value"+strIno);
    }
}
