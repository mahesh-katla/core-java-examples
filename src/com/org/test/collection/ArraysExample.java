package com.org.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

    public static void main(String[] args) {

        int[] aray = new int[5];

        Arrays.fill(aray, 55);

        for(int a:aray)
            System.out.println(a);

        int[] array1 = {1,3,4,5};

        int[] array2 = {1,23,4,5};

        boolean flag = Arrays.equals(array1, array2);

        System.out.println("Two Object Equal"+flag);


        String[] names = {"ramesh","anand","suresh"};

        List<String> nameList = Arrays.asList(names);

        Object[] employees = new Object[5];

        employees = (Object []) nameList.toArray();
    }
}
