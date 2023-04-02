package com.org.test.threads;

public class Test {

    public static void main(String args[])
    {
        new PrintStringsThread("Hello ", "there.");
        new PrintStringsThread("How are ", "you?");
        new PrintStringsThread("Thank you ","very much!");
        new PrintStringsThread("Bye ","Bye!");

    }
}

