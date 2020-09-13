package com.tectro;

import java.text.DecimalFormat;

public class Complex {
    private final double real;
    private final double imaginary;
    private final DecimalFormat format;
    public Complex(double Real, double Imaginary){
        real = Real;
        imaginary = Imaginary;
        format = new DecimalFormat("#.##");
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    @Override
    public String toString()
    {
        return (real!=0?format.format(real):"") + (imaginary>0? " +" : " ") + (imaginary!=0?format.format(imaginary):"")+"i";
    }

    public double Abs()
    {
        return Math.sqrt(real*real+ imaginary*imaginary);
    }
}
