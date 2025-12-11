package com.gmail.muha.task3;

public class Main {
    public static void main(String[] args) {

        printAreaRectangle(5.0);
    }

    static void printAreaRectangle(double width) {

        double areaRectangle = width * width * 2;
        System.out.println("Площадь прямоугольника с шириной вдвое меньшей длинны равна - " + areaRectangle);
    }
}
