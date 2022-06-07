package ru.geekbrains.javatest;

public class ThirdHW {

    public static void main(String[] args) {
        /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

        int[] array = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        printArray1(msg: "1. After:\t", array1);
        System.out.println(array1);
        change(array1);
        printArray1(msg: "1. Before:\t", array1);
        System.out.println("**********");

        /* 2. Задать пустой целочисленный массив длиной 100.
         С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] array2 = new int[100];
        fillIn(array2);
        printArray1(msg: "2. Filled with cycle:\t", array2);
        System.out.println("**********");

        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         пройти по нему циклом,
         и числа меньшие 6 умножить на 2;
         */
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1(msg: "3. Before:\t", array3);
        doubling(array3);
        printArray1(msg: "3. After:\t", array3);
        System.out.println("**********");

        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
        равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        */
        int side = 10;
        int[][] array4 = new int[side][side];
        crossFill(array4);
        printArray2( msg: "4. Result fill diagonals", array4);

        /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        типа int длиной len, каждая ячейка которого равна initialValue;
        */
        int[] returnArrayFromMethod = returnArray(len:10, initValue:999);
        printArray1(msg: "5, Array from method", returnArrayFromMethod);
        printArray1(msg: "5, Array from method", returnArray(len:10, initValue: 999));
    }
    public static void change(int[] array){
        for (int i= 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] =1;
            }
    }
    public static void fillIn (int[] array) {
        for (int i= 0; i < array.length; i++)
            array[i] = i +1;
    }
    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *=2;
    }
    public static void crossFill (int[][] arr) {
        int abc = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
            arr[i][abc - i] = 1;
        }
    }
    public static int[] returnArray(int len, int initValue){
        int[] tempArray = new int[len];
        for (int i = 0;)
    }

}
