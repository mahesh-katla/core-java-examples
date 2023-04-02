package com.org.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

    public static void main(String args[]){

        List<Integer> integers = new CopyOnWriteArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();

        while (itr.hasNext()) {
            Integer a = itr.next();
            integers.remove(a);
        }

    }
}
