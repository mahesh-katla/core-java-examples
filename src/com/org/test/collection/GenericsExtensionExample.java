package com.org.test.collection;

import java.util.ArrayList;

public class GenericsExtensionExample {

    public  static void  displayItems(ArrayList<? extends Person> list)
    {
      //  list.add(new Person("ramesh","chennai"));

        for(Person mylist:list)
            System.out.println(mylist);
    }

    public static void main(String[] args) {


        ArrayList<Employee1> alis = new ArrayList<Employee1>();
        Employee1 ge1 = new Employee1();
        Employee1 ge2 = new Employee1();
        alis.add(ge1);
        alis.add(ge2);
        //displayItems(alis);
    }
}
