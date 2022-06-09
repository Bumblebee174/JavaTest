package ru.geekbrains.javatest.hw1;

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
            System.out.println(" Sum is positive");
        }
        if (sum<0) {
            System.out.println(" Sum is negative");
        }
    }

    public static void printColor() {
        int value=100;
        if (value<=0) {
            System.out.println(" Red");
        }
        if (value>0 && value<=100) {
            System.out.println(" Yellow");
        }
        if (value>100) {
            System.out.println(" Green");
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
