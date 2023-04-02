package com.org.test.threads;

import java.util.Comparator;

public class ConverterExample {

    public static void  doConvert(Converter<Double,Double> conv,Double frm){

        System.out.println(conv.calculate(frm));
    }

    public static void main(String[] args) {
       Runnable runnable = () -> {

        };
        Comparator comparator = ( o1, o2) -> {
         return 0;
        };
        Converter<Double,Double> currencyConverter = val -> val * 45.0;

        doConvert(currencyConverter, 100.00);

        Converter<Double,Double> farenToCel = faren -> (faren-32) * 5/9;

        doConvert(farenToCel, 84.00);
    }

}
