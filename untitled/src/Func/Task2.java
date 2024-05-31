package Func;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        lineStars(n);
    }
    public static void lineStars(int n) {
        if (n > 0) {
            n--;
            System.out.print("*");
            lineStars(n);
        }
    }
}
