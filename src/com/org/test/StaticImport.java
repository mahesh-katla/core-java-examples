package com.org.test;

import java.util.*;
import static java.lang.System.out;
import static java.lang.System.in;

public class StaticImport {

    public static void main(String[] args) {

      /*  Scanner kb = new Scanner(in);
        out.print("Enter an integer ");

        int x = kb.nextInt();
        out.print("Enter a double ");

        double d = kb.nextDouble();
        out.println("The sum is " + (x+d));*/


        String line="Java,is,in,OOP,Language";

        Scanner sc1 = new Scanner(line);

        sc1.useDelimiter(",");

        while (sc1.hasNext())
        {
            System.out.println(sc1.next());
        }

    }
}
