package com.org.test.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDuplicateKeys {

    public static void main(String[] args) {

        Hashtable<String, String> htable =
                new Hashtable<String, String>();

        htable.put(new String("101"), new String("ramesh"));
        htable.put(new String("102"), new String("ganesh"));
        htable.put(new String("102"), new String("suresh"));
        htable.put(new String("102"), new String("suresh1"));

        Enumeration<String> keys = htable.keys();

        while (keys.hasMoreElements())
        {
            String ky = keys.nextElement();
            System.out.println("key ::"+ ky);
            System.out.println(htable.get(ky));
        }
    }

}
