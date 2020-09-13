package com.tectro;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Complex[] values = new Complex[]
                {
                        new Complex(1,2),
                        new Complex(2,3),
                        new Complex(3,4)
                };

        for (Complex cur : values)
            System.out.println(cur);

        double result = 0;
        for (Complex cur : values)
            result+= cur.Abs();

        System.out.println("\nСумма модулей этих комплексных чисел: "+ new DecimalFormat("#.###").format(result));
    }
}
