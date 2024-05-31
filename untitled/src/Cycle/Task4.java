package Cycle;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число больше \"0\": ");
        int n = input.nextInt();

        int divider = 1;
        double result = 0;

        while (divider < n) {
            result += 1.0/divider;
            divider++;
        }

        System.out.println(result);
    }
}
