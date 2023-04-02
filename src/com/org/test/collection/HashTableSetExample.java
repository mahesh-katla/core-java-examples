package com.org.test.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableSetExample {


   public  static void main(String args[]){

       Hashtable<String,Book> abook =

               new Hashtable<String,Book>();
       Book bk1 = new Book(200,"Java","bglr");
       Book bk2 = new Book(201,"J2ee","hyd");
       abook.put("1", bk1);
       abook.put("2", bk2);
       hashTabletoSet(abook);
   }

    public static void hashTabletoSet
            ( Hashtable<String, Book> ht )
    {
        Set<Map.Entry<String,Book>> htabSet = ht.entrySet();

        Iterator<Map.Entry<String,Book>> itr = htabSet.iterator();

        while(itr.hasNext())
        {

            Map.Entry<String, Book> mp = itr.next();

            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }
}


