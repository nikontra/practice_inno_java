package Massive.practice;

//Дан двумерный массив:
//    1. Вывести на экран элемент, расположенный в правом верхнем углу массива
//    2. Вывести на экран элемент, расположенный в левом нижнем углу массива

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[r.nextInt(2,5)][r.nextInt(2,5)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(arr[0][arr[0].length-1]);
        System.out.println(arr[arr.length-1][0]);
    }
}
