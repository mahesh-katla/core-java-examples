package com.org.test.collection;

public class  Book implements Comparable<Book>{
    private int bookno;
    private String bookname;
    private String author;

    public Book() {
    }

    public Book(int bookno, String bookname, String author) {
        this.bookno = bookno;
        this.bookname = bookname;
        this.author = author;
    }

    public int compareTo(Book otherbook) {
        if(this.bookno<otherbook.bookno) return -1;
        if(this.bookno>otherbook.bookno) return 1;
        return 0;
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
