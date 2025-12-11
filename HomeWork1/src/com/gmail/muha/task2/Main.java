package com.gmail.muha.task2;

public class Main {
    public static void main(String[] args) {

        int amountSmallCans = 12;
        int amountLargeCans = 9;

        printAmountMilkInLargeCans(amountSmallCans, amountLargeCans);
    }

    static void printAmountMilkInLargeCans(int amountSmallCans, int amountLargeCans) {

        int amountMilkInOneSmallCans = 80 / amountSmallCans;
        int amountMilkInOneLargeCans = amountMilkInOneSmallCans + 12;
        int amountMilkInLargeCans = amountMilkInOneLargeCans * amountLargeCans;
        System.out.println("Количество молока в больших бидонах - " + amountMilkInLargeCans);
    }
}
