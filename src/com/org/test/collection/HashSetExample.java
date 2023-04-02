package com.org.test.collection;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String args[]) {

        HashSet<Book> hs = new HashSet<Book>();

        Book b1= new Book(100,"java","herbert");
        Book b2 = new Book(101,"j2ee","kathy siera");
        Book b3 = new Book(101,"j2ee","kathy siera");

        hs.add(b1);
        hs.add(b2);
        hs.add(b3);

        for(Book bk:hs)
        {
            System.out.println(bk.getBookno());
            System.out.println(bk.getBookname());
        }
    }

}
