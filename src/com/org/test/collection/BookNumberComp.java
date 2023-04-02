package com.org.test.collection;

import java.util.Comparator;

public class BookNumberComp implements Comparator<Book> {

    public int compare(Book obj1, Book obj2) {

        if (obj1.getBookno() < obj2.getBookno()) return -1;
        if (obj1.getBookno() > obj2.getBookno()) return 1;
        return 0;

    }
}