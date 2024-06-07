package Massive.practice;

//Дан двумерный массив. Определить:
//    1. сумму всех элементов третьей строки массива
//    2. сумму всех элементов второго столбца массива

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[r.nextInt(3,6)][r.nextInt(3,6)];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(-100,100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumRow = 0;
        int sumCol = 0;

        for (int i = 0; i < arr[2].length; i++) {
            sumRow += arr[2][i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumCol += arr[i][1];
        }
        System.out.println(sumRow + " " + sumCol);
    }
}
