package Cycle;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.print("20 ");
        }

        for (int i = 10; i <= 25; i++) {
            System.out.printf("%d %d.4\n", i, i);
        }

        int a = input.nextInt();
        int b = input.nextInt();
        int res = 0;
        for (int i = a; i < b; i++) {
            res += i;
        }
        System.out.println(res);

        int n = input.nextInt();
        double y = 0;
        for (int i = 1; i <= n; i++) {
            y += input.nextDouble();
        }
        System.out.println(y/n);
    }
}
