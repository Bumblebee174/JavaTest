package ru.geekbrains.javatest.hw2;

public class SecondHW {
    public static void main(String[] args) {
        if ((method1(5,5)) == true) {    //Данный блок, как и в method3, для наглядности возвращаемого значения
            System.out.println("true");
        } else System.out.println("false");

        System.out.println(method2(1));


        if ((method3(0)) == true) {
            System.out.println("true");
        } else System.out.println("false");

        method4("some text", 5);

        if ((method5(480)) == true) {
            System.out.println("Високосный");
        } else System.out.println("НЕ високосный");
    }

    public static boolean method1(int a, int b) {
        int sum=a+b;
        if (sum>=10 && sum<=20) {
            return true;
        } else return false;
    }

    public static String method2(int a) {
        if (a%2==0 || a==0) {
            return ("Положительное");
        } else return ("Отрицательное");
    }

    public static boolean method3(int a) {
        if (a%2==0 || a==0) {
            return true;
        } else return false;
    }

    public static void method4(String text, int a ) {
        for (int i=0; i<a; i++) {
            System.out.println(text);
        }
    }

    public static boolean method5(int year) {
        if (year%400==0) {
            return true;
        } else
        if (year%4==0 && year%100!=0) {
            return true;
        } else return false;
    }
}
