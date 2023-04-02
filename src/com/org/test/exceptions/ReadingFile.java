package com.org.test.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

    public static void main(String args[]) throws IOException {
        printFile();

        try {
            int val = Integer.parseInt(args[0]);

            double amount  = val/0;

            System.out.println("Amount"+amount);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException  e) {
            e.printStackTrace();

        }


}

    private static void printFile() throws IOException {

        try ( FileInputStream input = new FileInputStream("file.txt") )
        {
            int data = input.read();
            while(data != -1)
            {
                System.out.print((char) data);
                data = input.read();
            }
        }
    }

}
