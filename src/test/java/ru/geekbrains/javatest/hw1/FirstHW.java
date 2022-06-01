package ru.geekbrains.javatest.hw1;
// Created by: Pavel
/* My first homework, this is really difficult/ I tried to do it many times
 */

public class FirstHW {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a=1,b=2,sum=a+b;
        if (sum>=0) {
            System.out.println("Сумма положительная");
        }
        if (sum<0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value=100;
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a=10,b=2;
        if (a>=b) {
            System.out.println("a >= b");
        }
        if (a<b) {
            System.out.println("a < b");
        }
    }
}
