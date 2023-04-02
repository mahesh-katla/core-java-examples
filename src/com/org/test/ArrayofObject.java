package com.org.test;

public class ArrayofObject {

    public void displaybooks(Book[] bks)
    {
        for(int i=0;i<bks.length;i++)
        {
            System.out.println("Book Number :="+bks[i].getBookNo());
            System.out.println("Book Name :="+bks[i].getBookName());
        }
    }

    public static void main(String args[])
    {
        Book[]  bk = new Book[2];
        Book b1 = new Book(100,"java");
        Book b2= new Book(101,"j2ee");
        bk[0]=b1;
        bk[1]=b2;
        ArrayofObject ab= new ArrayofObject();
        ab.displaybooks(bk);
    }
}

