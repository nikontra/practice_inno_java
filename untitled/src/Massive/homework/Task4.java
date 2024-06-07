package Massive.homework;

import java.util.Random;

//Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[r.nextInt(10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-100,100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
