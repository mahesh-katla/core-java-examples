package com.org.test.exceptions;

public class ThrowsWithMultipleFunctions {

    public static void main(String args[]) throws Exception {
       // method1(args);
       tryblkWithReturn("10");
    }

    public static void method1(String args[]) throws Exception{


        try {
            int den = Integer.parseInt(args[0]);
            if(den ==20){
                System.out.println(3/den);
            } else {
                throw new UserDefinedException("value is not valid");
            }

        } catch (ArithmeticException exc)
        {
            System.out.println("Divisor was 0.");
            throw new UserDefinedException("");
        }
        catch (ArrayIndexOutOfBoundsException exc2)
        {
            System.out.println("Missing argument.");
            throw exc2;
        }
    }

    public static String tryblkWithReturn(String data ) {
        try   {
            int no = Integer.parseInt(data);
        }
        catch (NumberFormatException e)  {
            System.out.println("Entering Catch Block");
            System.exit(0);
            return "Hello";
        }
        finally {
            System.out.println("Inside finally");
        }
        System.out.println("I am back");
        return "Hi";
    }



}

