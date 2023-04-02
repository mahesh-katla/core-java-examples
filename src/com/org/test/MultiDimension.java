package com.org.test;

public class MultiDimension {

    public static void multiDimension() {
        int[][] values = {   {1, 100, 10},     {2, 200, 20},      {3, 300, 30},     {4, 400, 40}   };

      //i= 0,j=0
        /* 1 100 10
        2 200 20
        3 300 30
        4 400 40*/

        for (int i = 0; i < 4; i++) {
            System.out.println("tesing outer loop  i value  == " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("tesing inner loop j value == "+j);
                System.out.println(values[i][j]);
            }
        }
    }

    public static  void main(String args[]){
        multiDimension();
    }
}
