package com.org.test.collection;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        BookNumberComp bc = new BookNumberComp();

        TreeSet<Book> tscomp = new TreeSet<Book>();

        Book bk1 = new Book(23,"java","kathy sierra");
        Book bk2 = new Book(101,"j2ee","james gosling");
        Book bk3 = new Book(11,"struts","haffzel manning");

        tscomp.add(bk1);
        tscomp.add(bk2);
        tscomp.add(bk3);

        for(Book book : tscomp){
            System.out.println(book.getBookno());
        }

    }
}
