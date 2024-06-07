package Massive.homework;

import java.util.Random;

//Составить программу:
// 1.нахождения минимального значения среди элементов любой строки двумерного массива;
// 2.нахождения максимального значения среди элементов любого столбца двумерного массива
public class Task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[r.nextInt(2,5)][r.nextInt(2,5)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int row = r.nextInt(arr.length);
        int col = r.nextInt(arr[0].length);
        System.out.printf("Минимальное значение в строке %d - %d\n", row+1, minElementRow(arr, row));
        System.out.printf("Максимальное значение в столбце %d - %d", col+1, maxElementCol(arr, col));
    }

    public static int minElementRow (int[][] arr, int row) {
        int min = arr[row][0];
        for (int i = 1; i < arr[row].length; i++) {
            if (arr[row][i] < min) {
                min = arr[row][i];
            }
        }
        return min;
    }

    public static int maxElementCol (int[][] arr, int col) {
        int max = arr[0][col];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
            }
        }
        return max;
    }
}
