package ru.geekbrains.javatest.hw3;

import java.util.Arrays;

    public class ThirdHW {
        public static void main(String[] args) {
            method1();
            method2();
            method3();
            method4();
            method5(3, 7);
        }
    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
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
    /* 2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
        public static void method2() {
            int arr[] = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = i+1;
            }
            System.out.println(Arrays.toString(arr));
        }
    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;
     */
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
    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
    элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
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
    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
    массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
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


