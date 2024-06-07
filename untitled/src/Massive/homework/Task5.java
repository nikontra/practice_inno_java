package Massive.homework;

import java.util.Random;

//Дан массив. Определить:
// 1.количество максимальных элементов в массиве;
// 2.количество минимальных элементов в массиве
public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[r.nextInt(20)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-20,20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Количество максимумов - " + countMaxElement(arr));
        System.out.println("Количество минимумов - " + countMinElement(arr));
    }
    public static int countMaxElement(int[] arr) {
        int max = arr[0];
        int countMaxElement = 1;
        for (int i = 1; i < arr.length; i++) {;
            if (arr[i] == max) {
                countMaxElement++;
            }
            if (arr[i] > max) {
                countMaxElement = 1;
                max = arr[i];
            }
        }
        return countMaxElement;
    }
    public static int countMinElement(int[] arr) {
        int min = arr[0];
        int countMinElement = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == min) {
                countMinElement++;
            }
            if (arr[i] < min) {
                countMinElement = 1;
                min = arr[i];
            }
        }
        return countMinElement;
    }
}
