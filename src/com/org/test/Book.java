package com.org.test;

public class Book {

    private int bookNo;
    private String bookName;
    public Book(int bookNo , String bookName){
       this.bookNo = bookNo;
       this.bookName = bookName;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
