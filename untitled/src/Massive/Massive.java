package Massive;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.deepToString;


public class Massive {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int [] nums2 = new int[3];
        Random r = new Random();
        int x = r.nextInt(6);
        System.out.println(x);
        int [][] nums3 = new int[3][3];
        int [][] nums4 = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] nums5 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i=0; i<nums5.length; i++) {
            for (int j=0; j<nums5[i].length; j++) {
                System.out.printf("%d", nums5[i][j]);
            }
            System.out.println();
        }
        String [][] chessBoard = new String[8][8];
        for (int i=0; i<chessBoard.length; i++) {
            for (int j=0; j<chessBoard[i].length; j++) {
                if((i+j)%2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        for (int i=0; i<chessBoard.length; i++) {
            for (int j=0; j<chessBoard[i].length; j++) {
                System.out.printf("%s  ", chessBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println(deepToString(chessBoard));

        String [] array = new String[2];
        System.out.println(array[0]);

        Integer [] array2 = new Integer[10];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<array2.length; i++) {
            array2[i] = input.nextInt();
        }
        System.out.println(deepToString(array2));
    }
}
