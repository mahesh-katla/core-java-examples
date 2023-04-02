package com.org.test.collection;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public  static void main(String args[]){
        Book  book1 = new Book();
        book1.setBookno(2);
        Book  book2 = new Book();
        book2.setBookno(1);

        Book  book3 = new Book();
        book3.setBookno(3);
        List<Book> list = Arrays.asList(book1, book2, book3);
        Collections.sort(list);

        for (Book book : list ){
            System.out.println(book.getBookno());
        }

        List<String> strings = Arrays.asList("satheesh", "java", "test");
        Collections.sort(strings);

    }
}
