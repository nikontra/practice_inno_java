package Cycle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите стартовое число: ");
        int numberStart = sc.nextInt();

        System.out.println("Укажите конечное число: ");
        int numberEnd = sc.nextInt();

        for (int i = numberStart; i <= numberEnd; i++) {
            System.out.printf("%d %d.5 %d.8\n", i, i, i-1);
        }
    }
}
