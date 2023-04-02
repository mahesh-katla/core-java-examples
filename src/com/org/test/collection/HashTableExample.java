package com.org.test.collection;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String args[]) {

        Hashtable<Book,Book> abook =

                new Hashtable<Book,Book>();


        Book bk1 = new Book(200,"Java","bglr");
        Book bk2 = new Book(201,"J2ee","hyd");

       // abook.put(new String("ram"),bk1 );
        abook.put(bk2 ,bk2);

        System.out.println(abook.get(bk2).getBookno());
    }

}
