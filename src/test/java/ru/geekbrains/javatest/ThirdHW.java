package ru.geekbrains.javatest;

import java.util.Arrays;

public class ThirdHW {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5(3,7);
    }

    public static void method1() {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr) + " Before");
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                arr[i]=1;
            } else arr[i]=0;
        }
        System.out.println(Arrays.toString(arr) + " After");
    }

    public static void method2() {
        int arr[] = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void method3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr) + " Before");
        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6)  {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr) + " After");
    }

    public static void method4() {
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;

                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void method5(int len, int initialValue) {
        int arr[] = new int [len];
        int i=0;
        while (i != len) {
            arr[i]=initialValue;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }



}
