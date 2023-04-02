package com.org.test.collection;

import java.util.Comparator;

public class BookNameComp implements Comparator<Book>
{
    public int compare(Book obj1, Book obj2) {
        String bk1 = obj1.getBookname();
        String bk2 = obj2.getBookname();
        return bk1.compareTo(bk2);
    }
}

