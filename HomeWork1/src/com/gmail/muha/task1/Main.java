package com.gmail.muha.task1;

public class Main {
    public static void main(String[] args) {

        double arithmeticMean = getArithmeticMean(300.0, 501.0);
        double arithmeticMean2 = getArithmeticMean(30.0, 601.0);
        System.out.println(arithmeticMean);
        System.out.println(arithmeticMean2);
    }

    static double getArithmeticMean(double oneNumber, double twoNumber) {
        return (oneNumber + twoNumber) / 2;
    }
}