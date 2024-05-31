package Func;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первую цифру:");
        int i = input.nextInt();
        System.out.println("Введите конечную цифру:");
        int n = input.nextInt();
        System.out.println("Укажите количество строк:");
        int count = input.nextInt();
        printTable(i, n, count);

    }

    public static void printTable (int i, int n, int count) {
        if (count > 0) {
            count--;
            printLineTable(i, n);
            System.out.println();
            printTable(i, n, count);
        }
    }

    public static void printLineTable(int i, int n) {
        if (i <= n) {
            System.out.print(i + " ");
            i++;
            printLineTable(i, n);
        }
    }
}
