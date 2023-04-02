package com.org.test.collection;

import java.util.ArrayList;

public class ReplaceString {

    public static void main(String args[]){
        String s= "Aventura Mall, Biscayne Boulevard, Aventura, FL, USA";
        System.out.println(s.indexOf("i"));
        StringBuilder result = new StringBuilder(s);

        int index = s.toLowerCase().indexOf("a");
        int i=0;
        while (index >= 0) {
            int additonalCharacters =0;
            if(i!=0) additonalCharacters = 9*i;
            i++;
            result.insert(index+additonalCharacters, "<em>");
            result.insert(index+additonalCharacters+5, "</em>");
            index = s.toLowerCase().indexOf("a", index + 1);


        }
        System.out.println(result);

    }
}
