package com.org.test.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparaterExample {

    public static void main(String[] args) {

        ArrayList<Book> bkList = new ArrayList<Book>();

        Book bk1 = new Book(23,"java","kathy sierra");
        Book bk2 = new Book(101,"j2ee","james gosling");
        Book bk3 = new Book(11,"struts","haffzel manning");

        bkList.add(bk1);
        bkList.add(bk2);
        bkList.add(bk3);

        Collections.sort(bkList, new BookNumberComp());

        for(Book bk:bkList)
        {
            System.out.println(bk.getBookno());
        }
    }

}
