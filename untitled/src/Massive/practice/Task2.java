package Massive.practice;

//Используя датчик случайных чисел, заполнить массив из двадцати элементов.
//Вывести полученный массив на экран.
//Дан массив. Напечатать:
//    1. все неотрицательные элементы
//    2. все элементы, не превышающие число 100

import java.util.Random;

import static java.util.Arrays.deepToString;

public class Task2 {
    public static void main(String[] args) {
        Double[] arr = new Double[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(-200, 200);
        }
        System.out.println(deepToString(arr));
        printPositiveElement(arr);
        printLessHundred(arr);
    }

    public static void printPositiveElement(Double[] arr) {
        System.out.println("Неотрицательные эдементы");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.printf("%f ", arr[i]);
            }
        }
        System.out.println();
    }

    public static void printLessHundred(Double[] arr) {
        System.out.println("Элементы меньше 100");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 100) {
                System.out.printf("%f ", arr[i]);
            }
        }
        System.out.println();
    }
}
