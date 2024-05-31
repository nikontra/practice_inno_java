package Cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число, которое надо повторить: ");
        int x = input.nextInt();

        System.out.println("Укажите, сколько повторений надо сделать: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(x);
        }
    }
}
